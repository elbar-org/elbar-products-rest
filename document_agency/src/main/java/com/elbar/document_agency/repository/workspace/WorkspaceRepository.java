package com.elbar.document_agency.repository.workspace;

import com.elbar.document_agency.entity.workspace.WorkspaceEntity;
import com.elbar.document_agency.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface WorkspaceRepository extends JpaRepository<WorkspaceEntity, Integer>, BaseRepository {
    Optional<WorkspaceEntity> findByCode(UUID code);
}
