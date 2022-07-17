package com.elbar.document_agency.controller.workspaceImage;

import com.elbar.document_agency.controller.GenericCUDController;
import com.elbar.document_agency.criteria.workspaceImage.WorkspaceImageCriteria;
import com.elbar.document_agency.dto.workspaceImage.WorkspaceImageCreateDTO;
import com.elbar.document_agency.dto.workspaceImage.WorkspaceImageGetDTO;
import com.elbar.document_agency.dto.workspaceImage.WorkspaceImageUpdateDTO;
import com.elbar.document_agency.response.Data;
import com.elbar.document_agency.utils.BaseUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

public interface WorkspaceImageController extends GenericCUDController<WorkspaceImageCreateDTO, WorkspaceImageUpdateDTO, UUID> {

    @RequestMapping(value = BaseUtils.PATH + BaseUtils.GET_PATH, method = RequestMethod.GET)
    ResponseEntity<Data<WorkspaceImageGetDTO>> get(@PathVariable UUID code);

    @RequestMapping(value = BaseUtils.PATH + BaseUtils.LIST_PATH, method = RequestMethod.GET)
    ResponseEntity<Data<List<WorkspaceImageGetDTO>>> list(@Valid WorkspaceImageCriteria criteria);
}
