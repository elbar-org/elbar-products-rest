package com.elbar.document_agency.repository.workspaceImage;

import com.elbar.document_agency.entity.workspaceImage.WorkspaceImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkspaceImageRepository extends JpaRepository<WorkspaceImage, Integer> {
}