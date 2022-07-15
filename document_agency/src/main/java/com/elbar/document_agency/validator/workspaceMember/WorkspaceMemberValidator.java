package com.elbar.document_agency.validator.workspaceMember;

import com.elbar.document_agency.dto.workspaceMember.WorkspaceMemberCreateDTO;
import com.elbar.document_agency.dto.workspaceMember.WorkspaceMemberUpdateDTO;
import com.elbar.document_agency.exception.exceptions.InvalidValidationException;
import com.elbar.document_agency.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.UUID;

@Component
public class WorkspaceMemberValidator extends AbstractValidator<WorkspaceMemberCreateDTO, WorkspaceMemberUpdateDTO, UUID> {
    @Override
    public void validOnCreate(WorkspaceMemberCreateDTO workspaceMemberCreateDTO) throws InvalidValidationException {
        if (Objects.isNull(workspaceMemberCreateDTO)) {
            throw new InvalidValidationException("DTO is null");
        }
    }

    @Override
    public void validOnUpdate(WorkspaceMemberUpdateDTO workspaceMemberUpdateDTO) throws InvalidValidationException {
        if (Objects.isNull(workspaceMemberUpdateDTO)) {
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
