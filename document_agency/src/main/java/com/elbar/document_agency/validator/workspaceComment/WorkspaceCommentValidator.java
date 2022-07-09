package com.elbar.document_agency.validator.workspaceComment;

import com.elbar.document_agency.dto.GenericDTO;
import com.elbar.document_agency.dto.workspaceComment.WorkspaceCommentCreateDTO;
import com.elbar.document_agency.exception.exceptions.InvalidValidationException;
import com.elbar.document_agency.validator.AbstractValidator;
import org.springframework.stereotype.Component;

@Component
public class WorkspaceCommentValidator extends AbstractValidator<WorkspaceCommentCreateDTO, GenericDTO, Integer> {
    @Override
    public void validOnCreate(WorkspaceCommentCreateDTO workspaceCommentCreateDTO) throws InvalidValidationException {

    }

    @Override
    public void validOnUpdate(GenericDTO genericDTO) throws InvalidValidationException {

    }

    @Override
    public void validateKey(Integer id) throws InvalidValidationException {

    }
}
