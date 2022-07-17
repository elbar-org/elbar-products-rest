package com.elbar.document_agency.controller.workspaceTemplate;

import com.elbar.document_agency.controller.AbstractController;
import com.elbar.document_agency.criteria.workspaceTemplate.WorkspaceTemplateCriteria;
import com.elbar.document_agency.dto.workspaceTemplate.WorkspaceTemplateCreateDTO;
import com.elbar.document_agency.dto.workspaceTemplate.WorkspaceTemplateDetailDTO;
import com.elbar.document_agency.dto.workspaceTemplate.WorkspaceTemplateGetDTO;
import com.elbar.document_agency.dto.workspaceTemplate.WorkspaceTemplateUpdateDTO;
import com.elbar.document_agency.response.Data;
import com.elbar.document_agency.service.workspaceTemplate.WorkspaceTemplateService;
import com.elbar.document_agency.utils.BaseUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/workspace_template/*")
public class WorkspaceTemplateControllerImpl extends AbstractController<WorkspaceTemplateService> implements WorkspaceTemplateController {
    public WorkspaceTemplateControllerImpl(WorkspaceTemplateService service) {
        super(service);
    }

    @Override
    public ResponseEntity<Data<String>> create(WorkspaceTemplateCreateDTO DTO) {
        service.create(DTO);
        return new ResponseEntity<>(new Data<>("Successfully Created - WorkspaceTemplate"), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Data<String>> update(WorkspaceTemplateUpdateDTO DTO) {
        service.update(DTO);
        return new ResponseEntity<>(new Data<>("Successfully Updated - WorkspaceTemplate"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<String>> delete(UUID code) {
        service.delete(code);
        return new ResponseEntity<>(new Data<>("Successfully Deleted - WorkspaceTemplate"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<WorkspaceTemplateGetDTO>> get(UUID code) {
        return new ResponseEntity<>(new Data<>(service.get(code)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<WorkspaceTemplateDetailDTO>> detail(UUID code) {
        return new ResponseEntity<>(new Data<>(service.detail(code)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<WorkspaceTemplateGetDTO>>> list(WorkspaceTemplateCriteria criteria) {
        return new ResponseEntity<>(new Data<>(service.list(criteria), service.count()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<WorkspaceTemplateGetDTO>>> getListWithCategoryCode(UUID code) {
        return new ResponseEntity<>(new Data<>(service.getListWithCategoryCode(code), service.count()), HttpStatus.OK);
    }
}
