package com.elbar.document_agency.mapper.workspaceTemplate;

import com.elbar.document_agency.dto.workspaceTemplate.WorkspaceTemplateCreateDTO;
import com.elbar.document_agency.dto.workspaceTemplate.WorkspaceTemplateDetailDTO;
import com.elbar.document_agency.dto.workspaceTemplate.WorkspaceTemplateGetDTO;
import com.elbar.document_agency.dto.workspaceTemplate.WorkspaceTemplateUpdateDTO;
import com.elbar.document_agency.entity.workspaceTemplate.WorkspaceTemplateEntity;
import com.elbar.document_agency.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface WorkspaceTemplateMapper extends GenericMapper<WorkspaceTemplateCreateDTO, WorkspaceTemplateUpdateDTO, WorkspaceTemplateGetDTO, WorkspaceTemplateDetailDTO, WorkspaceTemplateEntity> {
}
