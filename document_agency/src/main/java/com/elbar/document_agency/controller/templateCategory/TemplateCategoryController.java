package com.elbar.document_agency.controller.templateCategory;

import com.elbar.document_agency.controller.GenericCUDController;
import com.elbar.document_agency.criteria.templateCategory.TemplateCategoryCriteria;
import com.elbar.document_agency.dto.templateCategory.TemplateCategoryCreateDTO;
import com.elbar.document_agency.dto.templateCategory.TemplateCategoryGetDTO;
import com.elbar.document_agency.dto.templateCategory.TemplateCategoryUpdateDTO;
import com.elbar.document_agency.response.Data;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public interface TemplateCategoryController extends GenericCUDController<TemplateCategoryCreateDTO, TemplateCategoryUpdateDTO, UUID> {

    ResponseEntity<Data<TemplateCategoryGetDTO>> get(UUID id);

    ResponseEntity<Data<List<TemplateCategoryGetDTO>>> list(TemplateCategoryCriteria criteria);
}
