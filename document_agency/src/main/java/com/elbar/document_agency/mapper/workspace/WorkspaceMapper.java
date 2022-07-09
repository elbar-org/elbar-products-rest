package com.elbar.document_agency.mapper.workspace;

import com.elbar.document_agency.dto.workspace.WorkspaceCreateDTO;
import com.elbar.document_agency.dto.workspace.WorkspaceGetDTO;
import com.elbar.document_agency.dto.workspace.WorkspaceUpdateDTO;
import com.elbar.document_agency.dto.workspaceMember.WorkspaceDetailDTO;
import com.elbar.document_agency.entity.workspace.Workspace;
import com.elbar.document_agency.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface WorkspaceMapper extends GenericMapper<WorkspaceCreateDTO, WorkspaceUpdateDTO, WorkspaceGetDTO, WorkspaceDetailDTO, Workspace> {
}
