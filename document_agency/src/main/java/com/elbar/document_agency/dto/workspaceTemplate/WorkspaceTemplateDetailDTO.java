package com.elbar.document_agency.dto.workspaceTemplate;

import com.elbar.document_agency.dto.GenericDTO;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WorkspaceTemplateDetailDTO extends GenericDTO {
    private UUID categoryCode;
    private String name;
    private String content;
}
