package com.elbar.document_agency.controller.workspaceComment;

import com.elbar.document_agency.controller.AbstractController;
import com.elbar.document_agency.criteria.workspaceComment.WorkspaceCommentCriteria;
import com.elbar.document_agency.dto.workspaceComment.WorkspaceCommentCreateDTO;
import com.elbar.document_agency.dto.workspaceComment.WorkspaceCommentDetailDTO;
import com.elbar.document_agency.dto.workspaceComment.WorkspaceCommentGetDTO;
import com.elbar.document_agency.response.Data;
import com.elbar.document_agency.service.workspaceComment.WorkspaceCommentService;
import com.elbar.document_agency.utils.BaseUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/workspace_comment/*")
public class WorkspaceCommentControllerImpl extends AbstractController<WorkspaceCommentService> implements WorkspaceCommentController{

    public WorkspaceCommentControllerImpl(WorkspaceCommentService service) {
        super(service);
    }

    @Override
    public ResponseEntity<Data<WorkspaceCommentGetDTO>> get(UUID code) {
        return new ResponseEntity<>(new Data<>(service.get(code)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<WorkspaceCommentDetailDTO>> detail(UUID code) {
        return new ResponseEntity<>(new Data<>(service.detail(code)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<WorkspaceCommentGetDTO>>> list(WorkspaceCommentCriteria criteria) {
        return new ResponseEntity<>(new Data<>(service.list(criteria), service.count()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<String>> create(WorkspaceCommentCreateDTO DTO) {
        service.create(DTO);
        return new ResponseEntity<>(new Data<>("Successfully Created - WorkspaceComment"), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Data<String>> delete(UUID code) {
        service.delete(code);
        return new ResponseEntity<>(new Data<>("Successfully Deleted - WorkspaceComment"), HttpStatus.OK);
    }
}
