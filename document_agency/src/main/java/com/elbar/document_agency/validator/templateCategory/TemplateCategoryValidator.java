package com.elbar.document_agency.validator.templateCategory;

import com.elbar.document_agency.dto.templateCategory.TemplateCategoryCreateDTO;
import com.elbar.document_agency.dto.templateCategory.TemplateCategoryUpdateDTO;
import com.elbar.document_agency.exception.exceptions.InvalidValidationException;
import com.elbar.document_agency.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class TemplateCategoryValidator extends AbstractValidator<TemplateCategoryCreateDTO, TemplateCategoryUpdateDTO, UUID> {
    @Override
    public void validOnCreate(TemplateCategoryCreateDTO templateCategoryCreateDTO) throws InvalidValidationException {

    }

    @Override
    public void validOnUpdate(TemplateCategoryUpdateDTO templateCategoryUpdateDTO) throws InvalidValidationException {

    }

    @Override
    public void validateKey(UUID id) throws InvalidValidationException {

    }
}
