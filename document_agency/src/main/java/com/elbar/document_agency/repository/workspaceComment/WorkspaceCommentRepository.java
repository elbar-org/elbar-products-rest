package com.elbar.document_agency.repository.workspaceComment;

import com.elbar.document_agency.entity.workspaceComment.WorkspaceCommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkspaceCommentRepository extends JpaRepository<WorkspaceCommentEntity, Integer> {
}
