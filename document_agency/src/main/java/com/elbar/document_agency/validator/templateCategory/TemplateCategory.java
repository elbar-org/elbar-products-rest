package com.elbar.document_agency.validator.templateCategory;

import com.elbar.document_agency.dto.templateCategory.TemplateCategoryCreateDTO;
import com.elbar.document_agency.dto.templateCategory.TemplateCategoryUpdateDTO;
import com.elbar.document_agency.exception.exceptions.InvalidValidationException;
import com.elbar.document_agency.validator.AbstractValidator;
import org.springframework.stereotype.Component;

@Component
public class TemplateCategory extends AbstractValidator<TemplateCategoryCreateDTO, TemplateCategoryUpdateDTO, Integer> {
    @Override
    public void validOnCreate(TemplateCategoryCreateDTO templateCategoryCreateDTO) throws InvalidValidationException {

    }

    @Override
    public void validOnUpdate(TemplateCategoryUpdateDTO templateCategoryUpdateDTO) throws InvalidValidationException {

    }

    @Override
    public void validateKey(Integer id) throws InvalidValidationException {

    }
}
