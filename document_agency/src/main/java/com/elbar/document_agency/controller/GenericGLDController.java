package com.elbar.document_agency.controller;

import com.elbar.document_agency.criteria.BaseCriteria;
import com.elbar.document_agency.dto.GenericDTO;
import com.elbar.document_agency.response.Data;
import com.elbar.document_agency.utils.BaseUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;

public interface GenericGLDController<GD extends GenericDTO, DD extends GenericDTO, CR extends BaseCriteria, K extends Serializable> {
    @RequestMapping(value = BaseUtils.GET_PATH, method = RequestMethod.GET)
    ResponseEntity<Data<GD>> get(@PathVariable K code);

    @RequestMapping(value = BaseUtils.DETAIL_PATH, method = RequestMethod.GET)
    ResponseEntity<Data<DD>> detail(@PathVariable K code);

    @RequestMapping(value = BaseUtils.LIST_PATH, method = RequestMethod.GET)
    ResponseEntity<Data<List<GD>>> list(@Valid CR criteria);
}
