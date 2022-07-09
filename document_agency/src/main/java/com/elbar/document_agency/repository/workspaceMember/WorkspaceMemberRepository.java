package com.elbar.document_agency.repository.workspaceMember;

import com.elbar.document_agency.entity.workspaceMember.WorkspaceMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkspaceMemberRepository extends JpaRepository<WorkspaceMember, Integer> {
}
