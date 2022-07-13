package com.elbar.document_agency.service.templateCategory;

import com.elbar.document_agency.criteria.templateCategory.TemplateCategoryCriteria;
import com.elbar.document_agency.dto.templateCategory.TemplateCategoryCreateDTO;
import com.elbar.document_agency.dto.templateCategory.TemplateCategoryGetDTO;
import com.elbar.document_agency.dto.templateCategory.TemplateCategoryUpdateDTO;
import com.elbar.document_agency.service.GenericCUDService;

import java.util.List;
import java.util.UUID;

public interface TemplateCategoryService extends GenericCUDService<TemplateCategoryCreateDTO, TemplateCategoryUpdateDTO, UUID> {
    TemplateCategoryGetDTO get(UUID code);

    List<TemplateCategoryGetDTO> list(TemplateCategoryCriteria criteria);
}
