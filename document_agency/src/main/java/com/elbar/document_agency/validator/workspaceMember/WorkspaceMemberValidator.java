package com.elbar.document_agency.validator.workspaceMember;

import com.elbar.document_agency.dto.workspaceMember.WorkspaceMemberCreateDTO;
import com.elbar.document_agency.dto.workspaceMember.WorkspaceMemberUpdateDTO;
import com.elbar.document_agency.exception.exceptions.InvalidValidationException;
import com.elbar.document_agency.validator.AbstractValidator;
import org.springframework.stereotype.Component;

@Component
public class WorkspaceMemberValidator extends AbstractValidator<WorkspaceMemberCreateDTO, WorkspaceMemberUpdateDTO, Integer> {
    @Override
    public void validOnCreate(WorkspaceMemberCreateDTO workspaceMemberCreateDTO) throws InvalidValidationException {

    }

    @Override
    public void validOnUpdate(WorkspaceMemberUpdateDTO workspaceMemberUpdateDTO) throws InvalidValidationException {

    }

    @Override
    public void validateKey(Integer id) throws InvalidValidationException {

    }
}
