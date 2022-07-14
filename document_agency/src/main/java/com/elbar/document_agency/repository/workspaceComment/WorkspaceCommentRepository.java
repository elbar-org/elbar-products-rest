package com.elbar.document_agency.repository.workspaceComment;

import com.elbar.document_agency.entity.workspaceComment.WorkspaceCommentEntity;
import com.elbar.document_agency.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface WorkspaceCommentRepository extends JpaRepository<WorkspaceCommentEntity, Integer>, BaseRepository {
    Optional<WorkspaceCommentEntity> findByCode(UUID code);
}
