package com.elbar.document_agency.controller;

import com.elbar.document_agency.service.BaseService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class AbstractController<S extends BaseService> implements BaseController {
    protected final S service;
}
