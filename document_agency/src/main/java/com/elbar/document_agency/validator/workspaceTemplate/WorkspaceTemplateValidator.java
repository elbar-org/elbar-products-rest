package com.elbar.document_agency.validator.workspaceTemplate;

import com.elbar.document_agency.dto.workspaceTemplate.WorkspaceTemplateCreateDTO;
import com.elbar.document_agency.dto.workspaceTemplate.WorkspaceTemplateUpdateDTO;
import com.elbar.document_agency.exception.exceptions.InvalidValidationException;
import com.elbar.document_agency.validator.AbstractValidator;
import org.springframework.stereotype.Component;

@Component
public class WorkspaceTemplateValidator extends AbstractValidator<WorkspaceTemplateCreateDTO, WorkspaceTemplateUpdateDTO, Integer> {
    @Override
    public void validOnCreate(WorkspaceTemplateCreateDTO workspaceTemplateCreateDTO) throws InvalidValidationException {

    }

    @Override
    public void validOnUpdate(WorkspaceTemplateUpdateDTO workspaceTemplateUpdateDTO) throws InvalidValidationException {

    }

    @Override
    public void validateKey(Integer id) throws InvalidValidationException {

    }
}
