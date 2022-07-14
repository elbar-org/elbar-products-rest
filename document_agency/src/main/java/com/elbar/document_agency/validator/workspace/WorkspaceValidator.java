package com.elbar.document_agency.validator.workspace;

import com.elbar.document_agency.dto.workspace.WorkspaceCreateDTO;
import com.elbar.document_agency.dto.workspace.WorkspaceUpdateDTO;
import com.elbar.document_agency.exception.exceptions.InvalidValidationException;
import com.elbar.document_agency.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.UUID;

@Component
public class WorkspaceValidator extends AbstractValidator<WorkspaceCreateDTO, WorkspaceUpdateDTO, UUID> {
    @Override
    public void validOnCreate(WorkspaceCreateDTO workspaceCreateDTO) throws InvalidValidationException {
        if (Objects.isNull(workspaceCreateDTO)) {
            throw new InvalidValidationException("DTO is null");
        }
    }

    @Override
    public void validOnUpdate(WorkspaceUpdateDTO workspaceUpdateDTO) throws InvalidValidationException {
        if (Objects.isNull(workspaceUpdateDTO)) {
            throw new InvalidValidationException("DTO is null");
        }
    }

    @Override
    public void validateKey(UUID id) throws InvalidValidationException {
        if (Objects.isNull(id)) {
            throw new InvalidValidationException("ID is null");
        }
    }
}
