package com.elbar.document_agency.dto.workspaceMember;

import com.elbar.document_agency.dto.GenericDTO;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WorkspaceMemberDetailDTO extends GenericDTO {
    private UUID workspaceCode;
    private UUID userCode;
    private String role;
}
