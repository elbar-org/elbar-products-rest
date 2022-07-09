package com.elbar.document_agency.dto.workspaceImage;

import com.elbar.document_agency.dto.GenericDTO;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WorkspaceImageGetDTO extends GenericDTO {
    private UUID workspaceCode;
    private String backgroundImg;
    private String iconImg;
}
