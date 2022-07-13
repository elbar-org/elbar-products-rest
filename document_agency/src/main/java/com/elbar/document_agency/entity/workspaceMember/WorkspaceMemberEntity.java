package com.elbar.document_agency.entity.workspaceMember;

import com.elbar.document_agency.entity.Auditable;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "workspace_member")
public class WorkspaceMemberEntity extends Auditable {
    @Column(name = "workspace_code")
    private Integer workspaceCode;
    @Column(name = "user_code")
    private Integer userCode;
    private String role;
}
