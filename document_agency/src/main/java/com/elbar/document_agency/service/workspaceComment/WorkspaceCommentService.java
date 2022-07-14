package com.elbar.document_agency.service.workspaceComment;

import com.elbar.document_agency.criteria.workspaceComment.WorkspaceCommentCriteria;
import com.elbar.document_agency.dto.workspaceComment.WorkspaceCommentCreateDTO;
import com.elbar.document_agency.dto.workspaceComment.WorkspaceCommentDetailDTO;
import com.elbar.document_agency.dto.workspaceComment.WorkspaceCommentGetDTO;
import com.elbar.document_agency.service.BaseService;
import com.elbar.document_agency.service.GenericGLDService;

import java.util.UUID;

public interface WorkspaceCommentService extends GenericGLDService<WorkspaceCommentGetDTO, WorkspaceCommentDetailDTO, WorkspaceCommentCriteria, UUID>, BaseService {
    void create(WorkspaceCommentCreateDTO DTO);

    void delete(UUID code);
}
