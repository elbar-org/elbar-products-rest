package com.elbar.document_agency.controller.workspaceComment;

import com.elbar.document_agency.controller.GenericGLDController;
import com.elbar.document_agency.criteria.workspaceComment.WorkspaceCommentCriteria;
import com.elbar.document_agency.dto.workspaceComment.WorkspaceCommentCreateDTO;
import com.elbar.document_agency.dto.workspaceComment.WorkspaceCommentDetailDTO;
import com.elbar.document_agency.dto.workspaceComment.WorkspaceCommentGetDTO;
import com.elbar.document_agency.response.Data;
import com.elbar.document_agency.service.BaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.UUID;

public interface WorkspaceCommentController extends GenericGLDController<WorkspaceCommentGetDTO, WorkspaceCommentDetailDTO, WorkspaceCommentCriteria, UUID>, BaseService {

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    ResponseEntity<Data<String>> create(@RequestBody WorkspaceCommentCreateDTO DTO);

    @RequestMapping(value = "/delete/{code}", method = RequestMethod.DELETE)
    ResponseEntity<Data<String>> delete(@PathVariable UUID code);
}
