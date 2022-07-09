package com.elbar.document_agency.mapper.templateCategory;

import com.elbar.document_agency.dto.GenericDTO;
import com.elbar.document_agency.dto.templateCategory.TemplateCategoryCreateDTO;
import com.elbar.document_agency.dto.templateCategory.TemplateCategoryGetDTO;
import com.elbar.document_agency.dto.templateCategory.TemplateCategoryUpdateDTO;
import com.elbar.document_agency.entity.templateCategory.TemplateCategory;
import com.elbar.document_agency.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface TemplateCategoryMapper extends GenericMapper<TemplateCategoryCreateDTO, TemplateCategoryUpdateDTO, TemplateCategoryGetDTO, GenericDTO, TemplateCategory> {
}
