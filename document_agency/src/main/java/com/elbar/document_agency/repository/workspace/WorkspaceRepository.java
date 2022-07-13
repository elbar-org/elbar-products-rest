package com.elbar.document_agency.repository.workspace;

import com.elbar.document_agency.entity.workspace.WorkspaceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkspaceRepository extends JpaRepository<WorkspaceEntity, Integer> {
}
