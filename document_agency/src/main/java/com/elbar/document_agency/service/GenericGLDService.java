package com.elbar.document_agency.service;

import com.elbar.document_agency.criteria.GenericCriteria;
import com.elbar.document_agency.dto.GenericDTO;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;
import java.util.List;

public interface GenericGLDService<GD extends GenericDTO, DD extends GenericDTO, CR extends GenericCriteria, K extends Serializable> {
    GD get(K key);

    DD detail(K key);

    List<GD> list(CR criteria);
}
