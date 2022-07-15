package com.elbar.document_agency.repository.workspaceMember;

import com.elbar.document_agency.entity.workspaceMember.WorkspaceMemberEntity;
import com.elbar.document_agency.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.UUID;

@Repository
public interface WorkspaceMemberRepository extends JpaRepository<WorkspaceMemberEntity, Integer>, BaseRepository {
    Optional<WorkspaceMemberEntity> findByCode(UUID code);
}
