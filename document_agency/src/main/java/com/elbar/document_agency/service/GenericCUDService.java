package com.elbar.document_agency.service;

import com.elbar.document_agency.dto.BaseDTO;
import com.elbar.document_agency.dto.GenericDTO;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;

public interface GenericCUDService<CD extends BaseDTO, UD extends GenericDTO, K extends Serializable> {
    void create(CD DTO);

    void update(UD DTO);

    void delete(K key);
}
