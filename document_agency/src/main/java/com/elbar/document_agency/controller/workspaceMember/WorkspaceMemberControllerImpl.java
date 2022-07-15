package com.elbar.document_agency.controller.workspaceMember;

import com.elbar.document_agency.controller.AbstractController;
import com.elbar.document_agency.criteria.workspaceMember.WorkspaceMemberCriteria;
import com.elbar.document_agency.dto.workspaceMember.WorkspaceMemberCreateDTO;
import com.elbar.document_agency.dto.workspaceMember.WorkspaceMemberDetailDTO;
import com.elbar.document_agency.dto.workspaceMember.WorkspaceMemberGetDTO;
import com.elbar.document_agency.dto.workspaceMember.WorkspaceMemberUpdateDTO;
import com.elbar.document_agency.response.Data;
import com.elbar.document_agency.service.workspaceMember.WorkspaceMemberService;
import com.elbar.document_agency.utils.BaseUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/workspace_member/*")
public class WorkspaceMemberControllerImpl extends AbstractController<WorkspaceMemberService> implements WorkspaceMemberController {
    public WorkspaceMemberControllerImpl(WorkspaceMemberService service) {
        super(service);
    }

    @Override
    public ResponseEntity<Data<String>> create(WorkspaceMemberCreateDTO DTO) {
        service.create(DTO);
        return new ResponseEntity<>(new Data<>("Successfully Created - WorkspaceMember"), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Data<String>> update(WorkspaceMemberUpdateDTO DTO) {
        service.update(DTO);
        return new ResponseEntity<>(new Data<>("Successfully Updated - WorkspaceMember"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<String>> delete(UUID code) {
        service.delete(code);
        return new ResponseEntity<>(new Data<>("Successfully Deleted - WorkspaceMember"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<WorkspaceMemberGetDTO>> get(UUID code) {
        return new ResponseEntity<>(new Data<>(service.get(code)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<WorkspaceMemberDetailDTO>> detail(UUID code) {
        return new ResponseEntity<>(new Data<>(service.detail(code)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<WorkspaceMemberGetDTO>>> list(WorkspaceMemberCriteria criteria) {
        return new ResponseEntity<>(new Data<>(service.list(criteria)), HttpStatus.OK);
    }
}
