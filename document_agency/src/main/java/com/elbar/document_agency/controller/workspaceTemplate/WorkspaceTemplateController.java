package com.elbar.document_agency.controller.workspaceTemplate;

import com.elbar.document_agency.controller.GenericCUDController;
import com.elbar.document_agency.controller.GenericGLDController;
import com.elbar.document_agency.criteria.workspaceTemplate.WorkspaceTemplateCriteria;
import com.elbar.document_agency.dto.workspaceTemplate.WorkspaceTemplateCreateDTO;
import com.elbar.document_agency.dto.workspaceTemplate.WorkspaceTemplateDetailDTO;
import com.elbar.document_agency.dto.workspaceTemplate.WorkspaceTemplateGetDTO;
import com.elbar.document_agency.dto.workspaceTemplate.WorkspaceTemplateUpdateDTO;

import java.util.UUID;

public interface WorkspaceTemplateController extends GenericCUDController<WorkspaceTemplateCreateDTO, WorkspaceTemplateUpdateDTO, UUID>, GenericGLDController<WorkspaceTemplateGetDTO, WorkspaceTemplateDetailDTO, WorkspaceTemplateCriteria, UUID> {
}
