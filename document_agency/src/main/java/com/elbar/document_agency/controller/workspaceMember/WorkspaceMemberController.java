package com.elbar.document_agency.controller.workspaceMember;

import com.elbar.document_agency.controller.GenericCUDController;
import com.elbar.document_agency.controller.GenericGLDController;
import com.elbar.document_agency.criteria.workspaceMember.WorkspaceMemberCriteria;
import com.elbar.document_agency.dto.workspaceMember.WorkspaceMemberCreateDTO;
import com.elbar.document_agency.dto.workspaceMember.WorkspaceMemberDetailDTO;
import com.elbar.document_agency.dto.workspaceMember.WorkspaceMemberGetDTO;
import com.elbar.document_agency.dto.workspaceMember.WorkspaceMemberUpdateDTO;

import java.util.UUID;

public interface WorkspaceMemberController extends GenericCUDController<WorkspaceMemberCreateDTO, WorkspaceMemberUpdateDTO, UUID>, GenericGLDController<WorkspaceMemberGetDTO, WorkspaceMemberDetailDTO, WorkspaceMemberCriteria, UUID> {
}
