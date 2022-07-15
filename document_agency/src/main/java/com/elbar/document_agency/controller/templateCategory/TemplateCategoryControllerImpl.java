package com.elbar.document_agency.controller.templateCategory;

import com.elbar.document_agency.controller.AbstractController;
import com.elbar.document_agency.criteria.templateCategory.TemplateCategoryCriteria;
import com.elbar.document_agency.dto.templateCategory.TemplateCategoryCreateDTO;
import com.elbar.document_agency.dto.templateCategory.TemplateCategoryGetDTO;
import com.elbar.document_agency.dto.templateCategory.TemplateCategoryUpdateDTO;
import com.elbar.document_agency.response.Data;
import com.elbar.document_agency.service.templateCategory.TemplateCategoryService;
import com.elbar.document_agency.service.templateCategory.TemplateCategoryServiceImpl;
import com.elbar.document_agency.utils.BaseUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/template_category/*")
public class TemplateCategoryControllerImpl extends AbstractController<TemplateCategoryService> implements TemplateCategoryController {

    public TemplateCategoryControllerImpl(TemplateCategoryService service) {
        super(service);
    }

    @Override
    public ResponseEntity<Data<String>> create(TemplateCategoryCreateDTO DTO) {
        service.create(DTO);
        return new ResponseEntity<>(new Data<>("Successfully Created - TemplateCategory"), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Data<String>> update(TemplateCategoryUpdateDTO DTO) {
        service.update(DTO);
        return new ResponseEntity<>(new Data<>("Successfully Updated - TemplateCategory"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<String>> delete(UUID code) {
        service.delete(code);
        return new ResponseEntity<>(new Data<>("Successfully Deleted - TemplateCategory"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<TemplateCategoryGetDTO>> get(UUID code) {
        return new ResponseEntity<>(new Data<>(service.get(code)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<TemplateCategoryGetDTO>>> list(TemplateCategoryCriteria criteria) {
        return new ResponseEntity<>(new Data<>(service.list(criteria)), HttpStatus.OK);
    }
}
