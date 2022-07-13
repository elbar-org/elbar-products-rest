package com.elbar.document_agency.repository.workspaceMember;

import com.elbar.document_agency.entity.workspaceMember.WorkspaceMemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkspaceMemberRepository extends JpaRepository<WorkspaceMemberEntity, Integer> {
}
