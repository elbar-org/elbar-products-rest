package com.elbar.document_agency.validator.workspaceTemplate;

import com.elbar.document_agency.dto.workspaceTemplate.WorkspaceTemplateCreateDTO;
import com.elbar.document_agency.dto.workspaceTemplate.WorkspaceTemplateUpdateDTO;
import com.elbar.document_agency.exception.exceptions.InvalidValidationException;
import com.elbar.document_agency.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.UUID;

@Component
public class WorkspaceTemplateValidator extends AbstractValidator<WorkspaceTemplateCreateDTO, WorkspaceTemplateUpdateDTO, UUID> {
    @Override
    public void validOnCreate(WorkspaceTemplateCreateDTO workspaceTemplateCreateDTO) throws InvalidValidationException {
        if (Objects.isNull(workspaceTemplateCreateDTO)) {
            throw new InvalidValidationException("ID is null");
        }
    }

    @Override
    public void validOnUpdate(WorkspaceTemplateUpdateDTO workspaceTemplateUpdateDTO) throws InvalidValidationException {
        if (Objects.isNull(workspaceTemplateUpdateDTO)) {
            throw new InvalidValidationException("ID is null");
        }
    }

    @Override
    public void validateKey(UUID id) throws InvalidValidationException {
        if (Objects.isNull(id)) {
            throw new InvalidValidationException("ID is null");
        }
    }
}
