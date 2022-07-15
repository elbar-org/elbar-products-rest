package com.elbar.document_agency.mapper.workspaceMember;

import com.elbar.document_agency.dto.GenericDTO;
import com.elbar.document_agency.dto.workspaceMember.WorkspaceMemberCreateDTO;
import com.elbar.document_agency.dto.workspaceMember.WorkspaceMemberDetailDTO;
import com.elbar.document_agency.dto.workspaceMember.WorkspaceMemberGetDTO;
import com.elbar.document_agency.dto.workspaceMember.WorkspaceMemberUpdateDTO;
import com.elbar.document_agency.entity.workspaceMember.WorkspaceMemberEntity;
import com.elbar.document_agency.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface WorkspaceMemberMapper extends GenericMapper<WorkspaceMemberCreateDTO, WorkspaceMemberUpdateDTO, WorkspaceMemberGetDTO, WorkspaceMemberDetailDTO, WorkspaceMemberEntity> {
}
