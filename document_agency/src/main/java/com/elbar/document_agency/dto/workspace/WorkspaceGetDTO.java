package com.elbar.document_agency.dto.workspace;

import com.elbar.document_agency.dto.GenericDTO;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WorkspaceGetDTO extends GenericDTO {
    private UUID parentCode;
    private String name;
    private String text;
    private String visible;
    private UUID createdWithTemplate;
}
