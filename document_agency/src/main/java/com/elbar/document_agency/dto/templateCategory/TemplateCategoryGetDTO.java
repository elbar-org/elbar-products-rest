package com.elbar.document_agency.dto.templateCategory;

import com.elbar.document_agency.dto.GenericDTO;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TemplateCategoryGetDTO extends GenericDTO {
    private String name;
}
