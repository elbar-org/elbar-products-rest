package com.elbar.document_agency.service.workspaceImage;

import com.elbar.document_agency.criteria.workspaceImage.WorkspaceImageCriteria;
import com.elbar.document_agency.dto.workspaceImage.WorkspaceImageCreateDTO;
import com.elbar.document_agency.dto.workspaceImage.WorkspaceImageGetDTO;
import com.elbar.document_agency.dto.workspaceImage.WorkspaceImageUpdateDTO;
import com.elbar.document_agency.service.BaseService;
import com.elbar.document_agency.service.GenericCUDService;

import java.util.List;
import java.util.UUID;

public interface WorkspaceImageService extends GenericCUDService<WorkspaceImageCreateDTO, WorkspaceImageUpdateDTO, UUID>, BaseService {

    WorkspaceImageGetDTO get(UUID code);

    List<WorkspaceImageGetDTO> list(WorkspaceImageCriteria criteria);
}
