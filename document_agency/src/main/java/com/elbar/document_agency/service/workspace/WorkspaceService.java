package com.elbar.document_agency.service.workspace;

import com.elbar.document_agency.criteria.workspace.WorkspaceCriteria;
import com.elbar.document_agency.dto.workspace.WorkspaceCreateDTO;
import com.elbar.document_agency.dto.workspace.WorkspaceDetailDTO;
import com.elbar.document_agency.dto.workspace.WorkspaceGetDTO;
import com.elbar.document_agency.dto.workspace.WorkspaceUpdateDTO;
import com.elbar.document_agency.service.BaseService;
import com.elbar.document_agency.service.GenericCUDService;
import com.elbar.document_agency.service.GenericGLDService;

import java.util.UUID;

public interface WorkspaceService extends GenericCUDService<WorkspaceCreateDTO, WorkspaceUpdateDTO, UUID>, GenericGLDService<WorkspaceGetDTO, WorkspaceDetailDTO, WorkspaceCriteria, UUID>, BaseService {
    Long count();
}
