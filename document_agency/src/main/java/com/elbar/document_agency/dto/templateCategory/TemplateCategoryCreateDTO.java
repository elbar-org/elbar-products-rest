package com.elbar.document_agency.dto.templateCategory;

import com.elbar.document_agency.dto.BaseDTO;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TemplateCategoryCreateDTO implements BaseDTO {
    private String name;
}
