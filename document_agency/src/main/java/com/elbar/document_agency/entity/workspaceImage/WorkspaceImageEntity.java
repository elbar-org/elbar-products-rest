package com.elbar.document_agency.entity.workspaceImage;

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
@Table(name = "workspace_image")
public class WorkspaceImageEntity extends Auditable {
    @Column(name = "workspace_code")
    private Integer workspaceCode;
    @Column(name = "background_img")
    private String backgroundImg;
    @Column(name = "icon_img")
    private String iconImg;
}
