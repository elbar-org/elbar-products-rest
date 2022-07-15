package com.elbar.document_agency.repository.workspaceImage;

import com.elbar.document_agency.entity.workspaceImage.WorkspaceImageEntity;
import com.elbar.document_agency.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface WorkspaceImageRepository extends JpaRepository<WorkspaceImageEntity, Integer>, BaseRepository {
    Optional<WorkspaceImageEntity> findByCode(UUID code);
}
