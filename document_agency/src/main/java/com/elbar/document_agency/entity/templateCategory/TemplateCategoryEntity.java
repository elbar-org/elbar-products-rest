package com.elbar.document_agency.entity.templateCategory;

import com.elbar.document_agency.entity.Auditable;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "template_category")
public class TemplateCategoryEntity extends Auditable {
    private String name;
}
