package com.elbar.document_agency.utils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseUtils {
    public static final String API = "/api";
    public static final String VERSION = "/v1";
    public static final String PATH = API + VERSION;

    public static final String CREATE_PATH = "create";
    public static final String UPDATE_PATH = "update";
    public static final String DELETE_PATH = "delete/{code}";
    public static final String GET_PATH = "get/{code}";
    public static final String DETAIL_PATH = "detail/{code}";
    public static final String LIST_PATH = "list";
}
