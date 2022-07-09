package com.elbar.document_agency.dto.workspaceTemplate;

import com.elbar.document_agency.dto.BaseDTO;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WorkspaceTemplateCreateDTO implements BaseDTO {
    private UUID categoryCode;
    private String name;
    private String content;
}
