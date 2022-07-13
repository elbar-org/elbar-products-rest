package com.elbar.document_agency.entity.workspaceTemplate;

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
@Table(name = "workspace_template")
public class WorkspaceTemplateEntity extends Auditable {
    @Column(name = "category_code")
    private Integer categoryCode;
    private String name;
    private String content;
}
