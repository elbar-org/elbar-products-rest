package com.elbar.document_agency.entity.workspaceComment;

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
@Table(name = "workspace_comment")
public class WorkspaceComment extends Auditable {
    @Column(name = "workspace_code")
    private UUID workspaceCode;
    @Column(name = "comment_reply_code")
    private UUID commentReplyCode;
    private String comment;
}
