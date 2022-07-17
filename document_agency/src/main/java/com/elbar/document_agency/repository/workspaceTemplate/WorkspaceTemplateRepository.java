package com.elbar.document_agency.repository.workspaceTemplate;

import com.elbar.document_agency.entity.workspaceTemplate.WorkspaceTemplateEntity;
import com.elbar.document_agency.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface WorkspaceTemplateRepository extends JpaRepository<WorkspaceTemplateEntity, Integer>, BaseRepository {
    Optional<WorkspaceTemplateEntity> findByCode(UUID code);
    List<WorkspaceTemplateEntity> findAllByCategoryCodeEquals(UUID code);
}
