package com.elbar.document_agency.validator.workspaceComment;

import com.elbar.document_agency.dto.GenericDTO;
import com.elbar.document_agency.dto.workspaceComment.WorkspaceCommentCreateDTO;
import com.elbar.document_agency.exception.exceptions.InvalidValidationException;
import com.elbar.document_agency.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.UUID;

@Component
public class WorkspaceCommentValidator extends AbstractValidator<WorkspaceCommentCreateDTO, GenericDTO, UUID> {
    @Override
    public void validOnCreate(WorkspaceCommentCreateDTO workspaceCommentCreateDTO) throws InvalidValidationException {
        if (Objects.isNull(workspaceCommentCreateDTO)) {
            throw new InvalidValidationException("DTO is null");
        }
    }

    @Override
    public void validOnUpdate(GenericDTO genericDTO) throws InvalidValidationException {
        if (Objects.isNull(genericDTO)) {
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
