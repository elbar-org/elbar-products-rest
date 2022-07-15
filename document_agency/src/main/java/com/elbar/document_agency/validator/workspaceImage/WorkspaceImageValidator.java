package com.elbar.document_agency.validator.workspaceImage;

import com.elbar.document_agency.dto.workspaceImage.WorkspaceImageCreateDTO;
import com.elbar.document_agency.dto.workspaceImage.WorkspaceImageUpdateDTO;
import com.elbar.document_agency.exception.exceptions.InvalidValidationException;
import com.elbar.document_agency.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.UUID;

@Component
public class WorkspaceImageValidator extends AbstractValidator<WorkspaceImageCreateDTO, WorkspaceImageUpdateDTO, UUID> {
    @Override
    public void validOnCreate(WorkspaceImageCreateDTO workspaceImageCreateDTO) throws InvalidValidationException {
        if (Objects.isNull(workspaceImageCreateDTO)) {
            throw new InvalidValidationException("DTO is null");
        }
    }

    @Override
    public void validOnUpdate(WorkspaceImageUpdateDTO workspaceImageUpdateDTO) throws InvalidValidationException {
        if (Objects.isNull(workspaceImageUpdateDTO)) {
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
