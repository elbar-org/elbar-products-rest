package com.elbar.document_agency.dto.workspaceMember;

import com.elbar.document_agency.dto.BaseDTO;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WorkspaceMemberCreateDTO implements BaseDTO {
    private UUID workspaceCode;
    private UUID userCode;
    private String role;
}
