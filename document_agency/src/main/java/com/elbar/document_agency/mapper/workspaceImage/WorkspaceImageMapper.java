package com.elbar.document_agency.mapper.workspaceImage;

import com.elbar.document_agency.dto.GenericDTO;
import com.elbar.document_agency.dto.workspaceImage.WorkspaceImageCreateDTO;
import com.elbar.document_agency.dto.workspaceImage.WorkspaceImageGetDTO;
import com.elbar.document_agency.dto.workspaceImage.WorkspaceImageUpdateDTO;
import com.elbar.document_agency.entity.workspaceImage.WorkspaceImageEntity;
import com.elbar.document_agency.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface WorkspaceImageMapper extends GenericMapper<WorkspaceImageCreateDTO, WorkspaceImageUpdateDTO, WorkspaceImageGetDTO, GenericDTO, WorkspaceImageEntity> {
}
