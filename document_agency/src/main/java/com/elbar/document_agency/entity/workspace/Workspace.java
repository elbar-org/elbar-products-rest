package com.elbar.document_agency.entity.workspace;

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
@Table(name = "workspace")
public class Workspace extends Auditable {
    @Column(name = "parent_code")
    private UUID parentCode;
    @Column(name = "name", length = 250, nullable = false)
    private String name;
    private String text;
    @Column(name = "visible", nullable = false)
    private String visible;
    @Column(name = "created_with_template")
    private UUID createdWithTemplate;
}
