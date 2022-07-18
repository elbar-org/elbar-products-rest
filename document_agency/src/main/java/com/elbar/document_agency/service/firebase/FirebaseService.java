package com.elbar.document_agency.service.firebase;

import com.google.auth.Credentials;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.StorageOptions;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.UUID;

@Service
public class FirebaseService {

    private static final String CREDENTIAL_PATH = "D:\\Project\\Java\\DocumentAgent\\document_agency\\src\\main\\resources\\documentagency-326bf-firebase-adminsdk-27dw8-023929572e.json";
    private static final String BUCKET_NAME = "documentagency-326bf.appspot.com";
    public final static String DOWNLOAD_URL = "https://firebasestorage.googleapis.com/v0/b/" + BUCKET_NAME + "/o/%s?alt=media";

    @SneakyThrows
    public String upload(MultipartFile file) {
        String fileName = UUID.randomUUID() + file.getOriginalFilename();
        Blob blob = StorageOptions.newBuilder()
                .setCredentials(getCredentials())
                .build()
                .getService()
                .create(getBlobInfo(fileName, file.getContentType()), file.getBytes());
        return String.format(DOWNLOAD_URL, URLEncoder.encode(fileName, StandardCharsets.UTF_8));
    }

    public void delete(String code) {
        StorageOptions.newBuilder()
                .setCredentials(getCredentials())
                .build()
                .getService()
                .delete(BlobId.of(BUCKET_NAME, code));
    }

    @SneakyThrows
    private Credentials getCredentials() {
        File file = new File(CREDENTIAL_PATH);
        return GoogleCredentials.fromStream(new FileInputStream(file));
    }

    private BlobInfo getBlobInfo(String fileUniqueId, String contentType) {
        return BlobInfo
                .newBuilder(BlobId.of(BUCKET_NAME, fileUniqueId))
                .setContentType(Objects.isNull(contentType) ? "media" : contentType)
                .build();
    }

}
