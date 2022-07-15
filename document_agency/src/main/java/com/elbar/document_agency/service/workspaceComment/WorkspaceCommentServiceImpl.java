package com.elbar.document_agency.service.workspaceComment;

import com.elbar.document_agency.criteria.workspaceComment.WorkspaceCommentCriteria;
import com.elbar.document_agency.dto.workspaceComment.WorkspaceCommentCreateDTO;
import com.elbar.document_agency.dto.workspaceComment.WorkspaceCommentDetailDTO;
import com.elbar.document_agency.dto.workspaceComment.WorkspaceCommentGetDTO;
import com.elbar.document_agency.entity.workspaceComment.WorkspaceCommentEntity;
import com.elbar.document_agency.mapper.workspaceComment.WorkspaceCommentMapper;
import com.elbar.document_agency.repository.workspaceComment.WorkspaceCommentRepository;
import com.elbar.document_agency.service.AbstractService;
import com.elbar.document_agency.validator.workspaceComment.WorkspaceCommentValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.UUID;

@Service
public class WorkspaceCommentServiceImpl extends AbstractService<WorkspaceCommentRepository, WorkspaceCommentMapper, WorkspaceCommentValidator> implements WorkspaceCommentService {

    public WorkspaceCommentServiceImpl(WorkspaceCommentRepository repository, WorkspaceCommentMapper mapper, WorkspaceCommentValidator validator) {
        super(repository, mapper, validator);
    }

    @Override
    public WorkspaceCommentGetDTO get(UUID key) {
        validator.validateKey(key);
        return mapper.fromGetDTO(repository.findByCode(key).orElseThrow(() -> {
            throw new NotFoundException("WorkspaceComment not found");
        }));
    }

    @Override
    public WorkspaceCommentDetailDTO detail(UUID key) {
        validator.validateKey(key);
        return mapper.fromDetailDTO(repository.findByCode(key).orElseThrow(() -> {
            throw new NotFoundException("WorkspaceComment not found");
        }));
    }

    @Override
    public List<WorkspaceCommentGetDTO> list(WorkspaceCommentCriteria criteria) {
        PageRequest pageRequest = PageRequest.of(criteria.getPage(), criteria.getSize());
        return mapper.fromGetListDTO(repository.findAll(pageRequest).stream().toList());
    }

    @Override
    public void create(WorkspaceCommentCreateDTO DTO) {
        validator.validOnCreate(DTO);
        repository.save(mapper.toCreateDTO(DTO));
    }

    @Override
    public void delete(UUID code) {
        validator.validateKey(code);
        WorkspaceCommentEntity workspaceComment = repository.findByCode(code).orElseThrow(() -> {
            throw new NotFoundException("WorkspaceComment not found");
        });
        repository.delete(workspaceComment);
    }
}
