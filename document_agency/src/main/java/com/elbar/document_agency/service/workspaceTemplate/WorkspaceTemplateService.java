package com.elbar.document_agency.service.workspaceTemplate;

import com.elbar.document_agency.criteria.workspaceTemplate.WorkspaceTemplateCriteria;
import com.elbar.document_agency.dto.workspaceTemplate.WorkspaceTemplateCreateDTO;
import com.elbar.document_agency.dto.workspaceTemplate.WorkspaceTemplateDetailDTO;
import com.elbar.document_agency.dto.workspaceTemplate.WorkspaceTemplateGetDTO;
import com.elbar.document_agency.dto.workspaceTemplate.WorkspaceTemplateUpdateDTO;
import com.elbar.document_agency.service.BaseService;
import com.elbar.document_agency.service.GenericCUDService;
import com.elbar.document_agency.service.GenericGLDService;

import java.util.UUID;

public interface WorkspaceTemplateService extends GenericCUDService<WorkspaceTemplateCreateDTO, WorkspaceTemplateUpdateDTO, UUID>, GenericGLDService<WorkspaceTemplateGetDTO, WorkspaceTemplateDetailDTO, WorkspaceTemplateCriteria, UUID>, BaseService {
}
