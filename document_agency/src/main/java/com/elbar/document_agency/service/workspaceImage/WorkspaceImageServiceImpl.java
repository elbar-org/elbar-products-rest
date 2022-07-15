package com.elbar.document_agency.service.workspaceImage;

import com.elbar.document_agency.criteria.workspaceImage.WorkspaceImageCriteria;
import com.elbar.document_agency.dto.workspaceImage.WorkspaceImageCreateDTO;
import com.elbar.document_agency.dto.workspaceImage.WorkspaceImageGetDTO;
import com.elbar.document_agency.dto.workspaceImage.WorkspaceImageUpdateDTO;
import com.elbar.document_agency.entity.workspaceImage.WorkspaceImageEntity;
import com.elbar.document_agency.mapper.workspaceImage.WorkspaceImageMapper;
import com.elbar.document_agency.repository.workspaceImage.WorkspaceImageRepository;
import com.elbar.document_agency.service.AbstractService;
import com.elbar.document_agency.validator.workspaceImage.WorkspaceImageValidator;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.UUID;

@Service
public class WorkspaceImageServiceImpl extends AbstractService<WorkspaceImageRepository, WorkspaceImageMapper, WorkspaceImageValidator> implements WorkspaceImageService {

    public WorkspaceImageServiceImpl(WorkspaceImageRepository repository, WorkspaceImageMapper mapper, WorkspaceImageValidator validator) {
        super(repository, mapper, validator);
    }

    @Override
    public void create(WorkspaceImageCreateDTO DTO) {
        validator.validOnCreate(DTO);
        repository.save(mapper.toCreateDTO(DTO));
    }

    @Override
    public void update(WorkspaceImageUpdateDTO DTO) {
        validator.validOnUpdate(DTO);
        WorkspaceImageEntity workspaceImageEntity = repository.findByCode(DTO.getCode()).orElseThrow(() -> {
            throw new NotFoundException("WorkspaceImage not found");
        });
        BeanUtils.copyProperties(DTO, workspaceImageEntity, "code", "workspaceCode");
        repository.save(workspaceImageEntity);
    }

    @Override
    public void delete(UUID key) {
        validator.validateKey(key);
        WorkspaceImageEntity workspaceImage = repository.findByCode(key).orElseThrow(() -> {
            throw new NotFoundException("WorkspaceImage not found");
        });
        repository.delete(workspaceImage);
    }

    @Override
    public WorkspaceImageGetDTO get(UUID code) {
        validator.validateKey(code);
        return mapper.fromGetDTO(repository.findByCode(code).orElseThrow(() -> {
            throw new NotFoundException("WorkspaceImage not found");
        }));
    }

    @Override
    public List<WorkspaceImageGetDTO> list(WorkspaceImageCriteria criteria) {
        PageRequest pageRequest = PageRequest.of(criteria.getPage(), criteria.getSize());
        return mapper.fromGetListDTO(repository.findAll(pageRequest).stream().toList());
    }
}
