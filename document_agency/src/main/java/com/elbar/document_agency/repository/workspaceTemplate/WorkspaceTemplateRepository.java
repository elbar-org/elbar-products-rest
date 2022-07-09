package com.elbar.document_agency.repository.workspaceTemplate;

import com.elbar.document_agency.entity.workspaceTemplate.WorkspaceTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkspaceTemplateRepository extends JpaRepository<WorkspaceTemplate, Integer> {
}
