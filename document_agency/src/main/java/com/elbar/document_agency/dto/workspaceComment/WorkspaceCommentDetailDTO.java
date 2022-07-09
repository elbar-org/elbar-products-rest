package com.elbar.document_agency.dto.workspaceComment;

import com.elbar.document_agency.dto.GenericDTO;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WorkspaceCommentDetailDTO extends GenericDTO {
    private UUID workspaceCode;
    private UUID commentReplyCode;
    private String comment;
}
