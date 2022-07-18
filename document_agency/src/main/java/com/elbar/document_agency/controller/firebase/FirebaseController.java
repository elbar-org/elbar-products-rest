package com.elbar.document_agency.controller.firebase;

import com.elbar.document_agency.service.firebase.FirebaseService;
import com.elbar.document_agency.utils.BaseUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/firebase/*")
@RequiredArgsConstructor
public class FirebaseController {

    private final FirebaseService service;

    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> upload(@RequestParam("file") MultipartFile file) {
        return new ResponseEntity<>(service.upload(file), HttpStatus.OK);
    }

    @RequestMapping(value = "get/{code}", method = RequestMethod.GET)
    public ResponseEntity<String> get(@PathVariable String code) {
        return new ResponseEntity<>("Suces", HttpStatus.OK);
    }
}
