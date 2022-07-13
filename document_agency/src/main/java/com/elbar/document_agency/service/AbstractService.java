package com.elbar.document_agency.service;

import com.elbar.document_agency.mapper.BaseMapper;
import com.elbar.document_agency.repository.BaseRepository;
import com.elbar.document_agency.validator.BaseValidator;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class AbstractService<R extends BaseRepository, M extends BaseMapper, V extends BaseValidator> implements BaseService {
    protected final R repository;
    protected final M mapper;
    protected final V validator;
}
