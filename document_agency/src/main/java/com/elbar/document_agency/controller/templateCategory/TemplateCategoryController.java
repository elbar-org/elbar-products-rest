package com.elbar.document_agency.controller.templateCategory;

import com.elbar.document_agency.controller.GenericCUDController;
import com.elbar.document_agency.criteria.templateCategory.TemplateCategoryCriteria;
import com.elbar.document_agency.dto.templateCategory.TemplateCategoryCreateDTO;
import com.elbar.document_agency.dto.templateCategory.TemplateCategoryGetDTO;
import com.elbar.document_agency.dto.templateCategory.TemplateCategoryUpdateDTO;
import com.elbar.document_agency.response.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

public interface TemplateCategoryController extends GenericCUDController<TemplateCategoryCreateDTO, TemplateCategoryUpdateDTO, UUID> {

    @RequestMapping(value = "/get/{code}", method = RequestMethod.GET)
    ResponseEntity<Data<TemplateCategoryGetDTO>> get(@PathVariable UUID code);

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    ResponseEntity<Data<List<TemplateCategoryGetDTO>>> list(@Valid TemplateCategoryCriteria criteria);
}
