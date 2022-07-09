package com.elbar.document_agency.mapper.workspaceComment;

import com.elbar.document_agency.dto.GenericDTO;
import com.elbar.document_agency.dto.workspaceComment.WorkspaceCommentCreateDTO;
import com.elbar.document_agency.dto.workspaceComment.WorkspaceCommentDetailDTO;
import com.elbar.document_agency.dto.workspaceComment.WorkspaceCommentGetDTO;
import com.elbar.document_agency.entity.workspaceComment.WorkspaceComment;
import com.elbar.document_agency.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface WorkspaceCommentMapper extends GenericMapper<WorkspaceCommentCreateDTO, GenericDTO, WorkspaceCommentGetDTO, WorkspaceCommentDetailDTO, WorkspaceComment> {
}
