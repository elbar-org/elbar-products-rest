package com.elbar.document_agency.service.workspaceMember;

import com.elbar.document_agency.criteria.workspaceMember.WorkspaceMemberCriteria;
import com.elbar.document_agency.dto.workspaceMember.WorkspaceMemberCreateDTO;
import com.elbar.document_agency.dto.workspaceMember.WorkspaceMemberDetailDTO;
import com.elbar.document_agency.dto.workspaceMember.WorkspaceMemberGetDTO;
import com.elbar.document_agency.dto.workspaceMember.WorkspaceMemberUpdateDTO;
import com.elbar.document_agency.service.BaseService;
import com.elbar.document_agency.service.GenericCUDService;
import com.elbar.document_agency.service.GenericGLDService;

import java.util.UUID;

public interface WorkspaceMemberService extends GenericCUDService<WorkspaceMemberCreateDTO, WorkspaceMemberUpdateDTO, UUID>, GenericGLDService<WorkspaceMemberGetDTO, WorkspaceMemberDetailDTO, WorkspaceMemberCriteria, UUID>, BaseService {
    Long count();
}
