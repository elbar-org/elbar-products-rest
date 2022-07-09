package com.elbar.document_agency.dto.workspaceComment;

import com.elbar.document_agency.dto.BaseDTO;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WorkspaceCommentCreateDTO implements BaseDTO {
    private UUID workspaceCode;
    private UUID commentReplyCode;
    private String comment;
}
