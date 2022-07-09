package com.elbar.document_agency.validator.workspace;

import com.elbar.document_agency.dto.workspace.WorkspaceCreateDTO;
import com.elbar.document_agency.dto.workspace.WorkspaceUpdateDTO;
import com.elbar.document_agency.exception.exceptions.InvalidValidationException;
import com.elbar.document_agency.validator.AbstractValidator;
import org.springframework.stereotype.Component;

@Component
public class WorkspaceValidator extends AbstractValidator<WorkspaceCreateDTO, WorkspaceUpdateDTO, Integer> {
    @Override
    public void validOnCreate(WorkspaceCreateDTO workspaceCreateDTO) throws InvalidValidationException {

    }

    @Override
    public void validOnUpdate(WorkspaceUpdateDTO workspaceUpdateDTO) throws InvalidValidationException {

    }

    @Override
    public void validateKey(Integer id) throws InvalidValidationException {

    }
}
