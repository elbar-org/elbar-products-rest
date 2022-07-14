package com.elbar.document_agency.controller.workspace;

import com.elbar.document_agency.controller.GenericCUDController;
import com.elbar.document_agency.controller.GenericGLDController;
import com.elbar.document_agency.criteria.workspace.WorkspaceCriteria;
import com.elbar.document_agency.dto.workspace.WorkspaceCreateDTO;
import com.elbar.document_agency.dto.workspace.WorkspaceDetailDTO;
import com.elbar.document_agency.dto.workspace.WorkspaceGetDTO;
import com.elbar.document_agency.dto.workspace.WorkspaceUpdateDTO;

import java.util.UUID;

public interface WorkspaceController extends GenericCUDController<WorkspaceCreateDTO, WorkspaceUpdateDTO, UUID>, GenericGLDController<WorkspaceGetDTO, WorkspaceDetailDTO, WorkspaceCriteria, UUID> {
}
