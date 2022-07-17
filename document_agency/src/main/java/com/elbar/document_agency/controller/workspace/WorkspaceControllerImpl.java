package com.elbar.document_agency.controller.workspace;

import com.elbar.document_agency.controller.AbstractController;
import com.elbar.document_agency.criteria.workspace.WorkspaceCriteria;
import com.elbar.document_agency.dto.workspace.WorkspaceCreateDTO;
import com.elbar.document_agency.dto.workspace.WorkspaceDetailDTO;
import com.elbar.document_agency.dto.workspace.WorkspaceGetDTO;
import com.elbar.document_agency.dto.workspace.WorkspaceUpdateDTO;
import com.elbar.document_agency.response.Data;
import com.elbar.document_agency.service.workspace.WorkspaceService;
import com.elbar.document_agency.utils.BaseUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/workspace/*")
public class WorkspaceControllerImpl extends AbstractController<WorkspaceService> implements WorkspaceController {

    public WorkspaceControllerImpl(WorkspaceService service) {
        super(service);
    }

    @Override
    public ResponseEntity<Data<String>> create(WorkspaceCreateDTO DTO) {
        service.create(DTO);
        return new ResponseEntity<>(new Data<>("Successfully Created - Workspace"), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Data<String>> update(WorkspaceUpdateDTO DTO) {
        service.update(DTO);
        return new ResponseEntity<>(new Data<>("Successfully Updated - Workspace"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<String>> delete(UUID code) {
        service.delete(code);
        return new ResponseEntity<>(new Data<>("Successfully Deleted - Workspace"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<WorkspaceGetDTO>> get(UUID code) {
        return new ResponseEntity<>(new Data<>(service.get(code)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<WorkspaceDetailDTO>> detail(UUID code) {
        return new ResponseEntity<>(new Data<>(service.detail(code)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<WorkspaceGetDTO>>> list(WorkspaceCriteria criteria) {
        return new ResponseEntity<>(new Data<>(service.list(criteria), service.count()), HttpStatus.OK);
    }
}
