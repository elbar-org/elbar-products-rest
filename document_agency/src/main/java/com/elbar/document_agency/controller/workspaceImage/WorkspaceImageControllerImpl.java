package com.elbar.document_agency.controller.workspaceImage;

import com.elbar.document_agency.controller.AbstractController;
import com.elbar.document_agency.criteria.workspaceImage.WorkspaceImageCriteria;
import com.elbar.document_agency.dto.workspaceImage.WorkspaceImageCreateDTO;
import com.elbar.document_agency.dto.workspaceImage.WorkspaceImageGetDTO;
import com.elbar.document_agency.dto.workspaceImage.WorkspaceImageUpdateDTO;
import com.elbar.document_agency.response.Data;
import com.elbar.document_agency.service.workspaceImage.WorkspaceImageService;
import com.elbar.document_agency.utils.BaseUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = BaseUtils.PATH + "/workspace_image/*")
public class WorkspaceImageControllerImpl extends AbstractController<WorkspaceImageService> implements WorkspaceImageController {

    public WorkspaceImageControllerImpl(WorkspaceImageService service) {
        super(service);
    }

    @Override
    public ResponseEntity<Data<String>> create(WorkspaceImageCreateDTO DTO) {
        service.create(DTO);
        return new ResponseEntity<>(new Data<>("Successfully Created - WorkspaceImage"), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Data<String>> update(WorkspaceImageUpdateDTO DTO) {
        service.update(DTO);
        return new ResponseEntity<>(new Data<>("Successfully Updated - WorkspaceImage"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<String>> delete(UUID code) {
        service.delete(code);
        return new ResponseEntity<>(new Data<>("Successfully Deleted - WorkspaceImage"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<WorkspaceImageGetDTO>> get(UUID code) {
        return new ResponseEntity<>(new Data<>(service.get(code)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Data<List<WorkspaceImageGetDTO>>> list(WorkspaceImageCriteria criteria) {
        return new ResponseEntity<>(new Data<>(service.list(criteria)), HttpStatus.OK);
    }
}
