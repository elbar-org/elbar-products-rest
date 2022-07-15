package com.elbar.document_agency.service.workspace;

import com.elbar.document_agency.criteria.workspace.WorkspaceCriteria;
import com.elbar.document_agency.dto.workspace.WorkspaceCreateDTO;
import com.elbar.document_agency.dto.workspace.WorkspaceDetailDTO;
import com.elbar.document_agency.dto.workspace.WorkspaceGetDTO;
import com.elbar.document_agency.dto.workspace.WorkspaceUpdateDTO;
import com.elbar.document_agency.entity.workspace.WorkspaceEntity;
import com.elbar.document_agency.mapper.workspace.WorkspaceMapper;
import com.elbar.document_agency.repository.workspace.WorkspaceRepository;
import com.elbar.document_agency.service.AbstractService;
import com.elbar.document_agency.validator.workspace.WorkspaceValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.UUID;

@Service
public class WorkspaceServiceImpl extends AbstractService<WorkspaceRepository, WorkspaceMapper, WorkspaceValidator> implements WorkspaceService {

    Logger logger = LoggerFactory.getLogger(WorkspaceServiceImpl.class);

    public WorkspaceServiceImpl(WorkspaceRepository repository, WorkspaceMapper mapper, WorkspaceValidator validator) {
        super(repository, mapper, validator);
    }

    @Override
    public void create(WorkspaceCreateDTO DTO) {
        validator.validOnCreate(DTO);
        repository.save(mapper.toCreateDTO(DTO));
        logger.info("Workspace created with");
    }

    @Override
    public void update(WorkspaceUpdateDTO DTO) {
        validator.validOnUpdate(DTO);
        WorkspaceEntity workspaceEntity = repository.findByCode(DTO.getCode()).orElseThrow(() -> {
            logger.error("Workspace not found");
            throw new NotFoundException("Workspace not found");
        });
        BeanUtils.copyProperties(DTO, workspaceEntity, "code", "parentCode", "createdWithTemplate");
        repository.save(workspaceEntity);
        logger.info("Workspace updated");
    }

    @Override
    public void delete(UUID key) {
        validator.validateKey(key);
        WorkspaceEntity workspaceEntity = repository.findByCode(key).orElseThrow(() -> {
            logger.error("Workspace not found");
            throw new NotFoundException("Workspace not found");
        });
        repository.delete(workspaceEntity);
        logger.info("Workspace deleted");
    }

    @Override
    public WorkspaceGetDTO get(UUID key) {
        validator.validateKey(key);
        return mapper.fromGetDTO(repository.findByCode(key).orElseThrow(() -> {
            logger.error("Workspace not found");
            throw new NotFoundException("Workspace not found");
        }));
    }

    @Override
    public WorkspaceDetailDTO detail(UUID key) {
        validator.validateKey(key);
        return mapper.fromDetailDTO(repository.findByCode(key).orElseThrow(() -> {
            logger.error("Workspace not found");
            throw new NotFoundException("Workspace not found");
        }));
    }

    @Override
    public List<WorkspaceGetDTO> list(WorkspaceCriteria criteria) {
        PageRequest pageRequest = PageRequest.of(criteria.getPage(), criteria.getSize());
        return mapper.fromGetListDTO(repository.findAll(pageRequest).stream().toList());
    }
}
