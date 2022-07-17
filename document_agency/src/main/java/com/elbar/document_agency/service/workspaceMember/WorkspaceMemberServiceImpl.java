package com.elbar.document_agency.service.workspaceMember;

import com.elbar.document_agency.criteria.workspaceMember.WorkspaceMemberCriteria;
import com.elbar.document_agency.dto.workspaceMember.WorkspaceMemberCreateDTO;
import com.elbar.document_agency.dto.workspaceMember.WorkspaceMemberDetailDTO;
import com.elbar.document_agency.dto.workspaceMember.WorkspaceMemberGetDTO;
import com.elbar.document_agency.dto.workspaceMember.WorkspaceMemberUpdateDTO;
import com.elbar.document_agency.entity.workspaceMember.WorkspaceMemberEntity;
import com.elbar.document_agency.mapper.workspaceMember.WorkspaceMemberMapper;
import com.elbar.document_agency.repository.workspaceMember.WorkspaceMemberRepository;
import com.elbar.document_agency.service.AbstractService;
import com.elbar.document_agency.validator.workspaceMember.WorkspaceMemberValidator;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.UUID;

@Service
public class WorkspaceMemberServiceImpl extends AbstractService<WorkspaceMemberRepository, WorkspaceMemberMapper, WorkspaceMemberValidator> implements WorkspaceMemberService {

    public WorkspaceMemberServiceImpl(WorkspaceMemberRepository repository, WorkspaceMemberMapper mapper, WorkspaceMemberValidator validator) {
        super(repository, mapper, validator);
    }

    @Override
    public void create(WorkspaceMemberCreateDTO DTO) {
        validator.validOnCreate(DTO);
        repository.save(mapper.toCreateDTO(DTO));
    }

    @Override
    public void update(WorkspaceMemberUpdateDTO DTO) {
        validator.validOnUpdate(DTO);
        WorkspaceMemberEntity workspaceMemberEntity = repository.findByCode(DTO.getCode()).orElseThrow(() -> {
            throw new NotFoundException("TemplateCategory not found");
        });
        BeanUtils.copyProperties(DTO, workspaceMemberEntity, "code", "workspaceCode", "userCode");
        repository.save(workspaceMemberEntity);
    }

    @Override
    public void delete(UUID key) {
        validator.validateKey(key);
        WorkspaceMemberEntity workspaceMemberEntity = repository.findByCode(key).orElseThrow(() -> {
            throw new NotFoundException("WorkspaceMember not found");
        });
        repository.delete(workspaceMemberEntity);
    }

    @Override
    public WorkspaceMemberGetDTO get(UUID key) {
        validator.validateKey(key);
        return mapper.fromGetDTO(repository.findByCode(key).orElseThrow(() -> {
            throw new NotFoundException("WorkspaceMember not found");
        }));
    }

    @Override
    public WorkspaceMemberDetailDTO detail(UUID key) {
        validator.validateKey(key);
        return mapper.fromDetailDTO(repository.findByCode(key).orElseThrow(() -> {
            throw new NotFoundException("WorkspaceMember not found");
        }));
    }

    @Override
    public List<WorkspaceMemberGetDTO> list(WorkspaceMemberCriteria criteria) {
        PageRequest pageRequest = PageRequest.of(criteria.getPage(), criteria.getSize());
        return mapper.fromGetListDTO(repository.findAll(pageRequest).stream().toList());
    }

    @Override
    public Long count() {
        return repository.count();
    }
}
