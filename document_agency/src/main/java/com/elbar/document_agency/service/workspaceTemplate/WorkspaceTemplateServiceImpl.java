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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.UUID;

@Service
public class WorkspaceTemplateServiceImpl extends AbstractService<WorkspaceTemplateRepository, WorkspaceTemplateMapper, WorkspaceTemplateValidator> implements WorkspaceTemplateService {

    Logger logger = LoggerFactory.getLogger(WorkspaceTemplateServiceImpl.class);

    public WorkspaceTemplateServiceImpl(WorkspaceTemplateRepository repository, WorkspaceTemplateMapper mapper, WorkspaceTemplateValidator validator) {
        super(repository, mapper, validator);
    }

    @Override
    public void create(WorkspaceTemplateCreateDTO DTO) {
        validator.validOnCreate(DTO);
        repository.save(mapper.toCreateDTO(DTO));
        logger.info("WorkspaceTemplate created");
    }

    @Override
    public void update(WorkspaceTemplateUpdateDTO DTO) {
        validator.validOnUpdate(DTO);
        WorkspaceTemplateEntity workspaceTemplateEntity = repository.findByCode(DTO.getCode()).orElseThrow(() -> {
            logger.error("WorkspaceTemplate not found");
            throw new NotFoundException("WorkspaceTemplate not found");
        });
        BeanUtils.copyProperties(DTO, workspaceTemplateEntity, "code", "categoryCode");
        repository.save(workspaceTemplateEntity);
        logger.info("WorkspaceTemplate updated");
    }

    @Override
    public void delete(UUID key) {
        validator.validateKey(key);
        WorkspaceTemplateEntity workspaceTemplateEntity = repository.findByCode(key).orElseThrow(() -> {
            logger.error("WorkspaceTemplate not found");
            throw new NotFoundException("WorkspaceTemplate not found");
        });
        repository.delete(workspaceTemplateEntity);
        logger.info("WorkspaceTemplate deleted");
    }

    @Override
    public WorkspaceTemplateGetDTO get(UUID key) {
        validator.validateKey(key);
        return mapper.fromGetDTO(repository.findByCode(key).orElseThrow(() -> {
            logger.error("WorkspaceTemplate not found");
            throw new NotFoundException("WorkspaceTemplate not found");
        }));
    }

    @Override
    public WorkspaceTemplateDetailDTO detail(UUID key) {
        validator.validateKey(key);
        return mapper.fromDetailDTO(repository.findByCode(key).orElseThrow(() -> {
            logger.error("WorkspaceTemplate not found");
            throw new NotFoundException("WorkspaceTemplate not found");
        }));
    }

    @Override
    public List<WorkspaceTemplateGetDTO> list(WorkspaceTemplateCriteria criteria) {
        PageRequest pageRequest = PageRequest.of(criteria.getPage(), criteria.getSize());
        logger.error("WorkspaceTemplate list");
        return mapper.fromGetListDTO(repository.findAll(pageRequest).stream().toList());
    }
}
