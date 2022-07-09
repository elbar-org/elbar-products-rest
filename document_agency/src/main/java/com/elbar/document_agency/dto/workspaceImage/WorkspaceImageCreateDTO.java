package com.elbar.document_agency.dto.workspaceImage;

import com.elbar.document_agency.dto.BaseDTO;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WorkspaceImageCreateDTO implements BaseDTO {
    private UUID workspaceCode;
    private String backgroundImg;
    private String iconImg;
}
