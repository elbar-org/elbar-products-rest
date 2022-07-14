package com.elbar.document_agency.controller;

import com.elbar.document_agency.dto.BaseDTO;
import com.elbar.document_agency.dto.GenericDTO;
import com.elbar.document_agency.response.Data;
import com.elbar.document_agency.utils.BaseUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.io.Serializable;

public interface GenericCUDController<CD extends BaseDTO, UD extends GenericDTO, K extends Serializable> {
    @RequestMapping(value = BaseUtils.CREATE_PATH, method = RequestMethod.POST)
    ResponseEntity<Data<String>> create(@Valid @RequestBody CD DTO);

    @RequestMapping(value = BaseUtils.UPDATE_PATH, method = RequestMethod.PUT)
    ResponseEntity<Data<String>> update(@Valid @RequestBody UD DTO);

    @RequestMapping(value = BaseUtils.DELETE_PATH, method = RequestMethod.DELETE)
    ResponseEntity<Data<String>> delete(@PathVariable K code);
}
