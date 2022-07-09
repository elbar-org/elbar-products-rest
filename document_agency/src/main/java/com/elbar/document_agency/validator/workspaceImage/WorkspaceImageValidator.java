package com.elbar.document_agency.validator.workspaceImage;

import com.elbar.document_agency.dto.workspaceImage.WorkspaceImageCreateDTO;
import com.elbar.document_agency.dto.workspaceImage.WorkspaceImageUpdateDTO;
import com.elbar.document_agency.exception.exceptions.InvalidValidationException;
import com.elbar.document_agency.validator.AbstractValidator;
import org.springframework.stereotype.Component;

@Component
public class WorkspaceImageValidator extends AbstractValidator<WorkspaceImageCreateDTO, WorkspaceImageUpdateDTO, Integer> {
    @Override
    public void validOnCreate(WorkspaceImageCreateDTO workspaceImageCreateDTO) throws InvalidValidationException {

    }

    @Override
    public void validOnUpdate(WorkspaceImageUpdateDTO workspaceImageUpdateDTO) throws InvalidValidationException {

    }

    @Override
    public void validateKey(Integer id) throws InvalidValidationException {

    }
}
