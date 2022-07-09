package com.elbar.document_agency.validator;

import com.elbar.document_agency.dto.BaseDTO;
import com.elbar.document_agency.dto.GenericDTO;
import com.elbar.document_agency.exception.exceptions.InvalidValidationException;

import java.io.Serializable;

public abstract class AbstractValidator<CD extends BaseDTO, UD extends GenericDTO, K extends Serializable> implements BaseValidator {
    public abstract void validOnCreate(CD cd) throws InvalidValidationException;

    public abstract void validOnUpdate(UD ud) throws InvalidValidationException;

    public abstract void validateKey(K id) throws InvalidValidationException;
}
