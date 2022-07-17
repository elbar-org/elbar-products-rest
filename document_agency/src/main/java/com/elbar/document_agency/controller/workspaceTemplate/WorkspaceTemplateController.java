package com.elbar.document_agency.controller.workspaceTemplate;

import com.elbar.document_agency.controller.GenericCUDController;
import com.elbar.document_agency.controller.GenericGLDController;
import com.elbar.document_agency.criteria.workspaceTemplate.WorkspaceTemplateCriteria;
import com.elbar.document_agency.dto.workspaceTemplate.WorkspaceTemplateCreateDTO;
import com.elbar.document_agency.dto.workspaceTemplate.WorkspaceTemplateDetailDTO;
import com.elbar.document_agency.dto.workspaceTemplate.WorkspaceTemplateGetDTO;
import com.elbar.document_agency.dto.workspaceTemplate.WorkspaceTemplateUpdateDTO;
import com.elbar.document_agency.response.Data;
import com.elbar.document_agency.utils.BaseUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.UUID;

public interface WorkspaceTemplateController extends GenericCUDController<WorkspaceTemplateCreateDTO, WorkspaceTemplateUpdateDTO, UUID>, GenericGLDController<WorkspaceTemplateGetDTO, WorkspaceTemplateDetailDTO, WorkspaceTemplateCriteria, UUID> {

    @RequestMapping(value = BaseUtils.PATH + "/getListWithCategoryCode/{code}", method = RequestMethod.GET)
    ResponseEntity<Data<List<WorkspaceTemplateGetDTO>>> getListWithCategoryCode(@PathVariable UUID code);
}
