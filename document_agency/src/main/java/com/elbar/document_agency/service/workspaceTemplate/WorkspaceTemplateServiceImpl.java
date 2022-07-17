package com.elbar.document_agency.service.workspaceTemplate;

import com.elbar.document_agency.criteria.workspaceTemplate.WorkspaceTemplateCriteria;
import com.elbar.document_agency.dto.workspaceTemplate.WorkspaceTemplateCreateDTO;
import com.elbar.document_agency.dto.workspaceTemplate.WorkspaceTemplateDetailDTO;
import com.elbar.document_agency.dto.workspaceTemplate.WorkspaceTemplateGetDTO;
import com.elbar.document_agency.dto.workspaceTemplate.WorkspaceTemplateUpdateDTO;
import com.elbar.document_agency.entity.workspaceTemplate.WorkspaceTemplateEntity;
import com.elbar.document_agency.mapper.workspaceTemplate.WorkspaceTemplateMapper;
import com.elbar.document_agency.repository.workspaceTemplate.WorkspaceTemplateRepository;
import com.elbar.document_agency.service.AbstractService;
import com.elbar.document_agency.validator.workspaceTemplate.WorkspaceTemplateValidator;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.UUID;

@Service
public class WorkspaceTemplateServiceImpl extends AbstractService<WorkspaceTemplateRepository, WorkspaceTemplateMapper, WorkspaceTemplateValidator> implements WorkspaceTemplateService {

    public WorkspaceTemplateServiceImpl(WorkspaceTemplateRepository repository, WorkspaceTemplateMapper mapper, WorkspaceTemplateValidator validator) {
        super(repository, mapper, validator);
    }

    @Override
    public void create(WorkspaceTemplateCreateDTO DTO) {
        validator.validOnCreate(DTO);
        repository.save(mapper.toCreateDTO(DTO));
    }

    @Override
    public void update(WorkspaceTemplateUpdateDTO DTO) {
        validator.validOnUpdate(DTO);
        WorkspaceTemplateEntity workspaceTemplateEntity = repository.findByCode(DTO.getCode()).orElseThrow(() -> {
            throw new NotFoundException("WorkspaceTemplate not found");
        });
        BeanUtils.copyProperties(DTO, workspaceTemplateEntity, "code", "categoryCode");
        repository.save(workspaceTemplateEntity);
    }

    @Override
    public void delete(UUID key) {
        validator.validateKey(key);
        WorkspaceTemplateEntity workspaceTemplateEntity = repository.findByCode(key).orElseThrow(() -> {
            throw new NotFoundException("WorkspaceTemplate not found");
        });
        repository.delete(workspaceTemplateEntity);
    }

    @Override
    public WorkspaceTemplateGetDTO get(UUID key) {
        validator.validateKey(key);
        return mapper.fromGetDTO(repository.findByCode(key).orElseThrow(() -> {
            throw new NotFoundException("WorkspaceTemplate not found");
        }));
    }

    @Override
    public WorkspaceTemplateDetailDTO detail(UUID key) {
        validator.validateKey(key);
        return mapper.fromDetailDTO(repository.findByCode(key).orElseThrow(() -> {
            throw new NotFoundException("WorkspaceTemplate not found");
        }));
    }

    @Override
    public List<WorkspaceTemplateGetDTO> getListWithCategoryCode(UUID code) {
        return mapper.fromGetListDTO(repository.findAllByCategoryCodeEquals(code));
    }

    @Override
    public Long count() {
        return repository.count();
    }

    @Override
    public List<WorkspaceTemplateGetDTO> list(WorkspaceTemplateCriteria criteria) {
        PageRequest pageRequest = PageRequest.of(criteria.getPage(), criteria.getSize());
        return mapper.fromGetListDTO(repository.findAll(pageRequest).stream().toList());
    }


}
