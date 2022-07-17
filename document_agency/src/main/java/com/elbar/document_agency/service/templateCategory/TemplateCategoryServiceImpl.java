package com.elbar.document_agency.service.templateCategory;

import com.elbar.document_agency.criteria.templateCategory.TemplateCategoryCriteria;
import com.elbar.document_agency.dto.templateCategory.TemplateCategoryCreateDTO;
import com.elbar.document_agency.dto.templateCategory.TemplateCategoryGetDTO;
import com.elbar.document_agency.dto.templateCategory.TemplateCategoryUpdateDTO;
import com.elbar.document_agency.entity.templateCategory.TemplateCategoryEntity;
import com.elbar.document_agency.mapper.templateCategory.TemplateCategoryMapper;
import com.elbar.document_agency.repository.templateCategory.TemplateCategoryRepository;
import com.elbar.document_agency.service.AbstractService;
import com.elbar.document_agency.validator.templateCategory.TemplateCategoryValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.UUID;

@Service
public class TemplateCategoryServiceImpl extends AbstractService<TemplateCategoryRepository, TemplateCategoryMapper, TemplateCategoryValidator> implements TemplateCategoryService {

    public TemplateCategoryServiceImpl(TemplateCategoryRepository repository, TemplateCategoryMapper mapper, TemplateCategoryValidator validator) {
        super(repository, mapper, validator);
    }

    @Override
    public void create(TemplateCategoryCreateDTO DTO) {
        validator.validOnCreate(DTO);
        repository.save(mapper.toCreateDTO(DTO));
    }

    @Override
    public void update(TemplateCategoryUpdateDTO DTO) {
        validator.validOnUpdate(DTO);
        TemplateCategoryEntity templateCategory = repository.findByCode(DTO.getCode()).orElseThrow(() -> {
            throw new NotFoundException("TemplateCategory not found");
        });
        BeanUtils.copyProperties(DTO, templateCategory, "code");
        repository.save(templateCategory);
    }

    @Override
    public void delete(UUID key) {
        validator.validateKey(key);
        TemplateCategoryEntity templateCategory = repository.findByCode(key).orElseThrow(() -> {
            throw new NotFoundException("TemplateCategory not found");
        });
        repository.delete(templateCategory);
    }

    @Override
    public TemplateCategoryGetDTO get(UUID code) {
        validator.validateKey(code);
        return mapper.fromGetDTO(repository.findByCode(code).orElseThrow(() -> {
            throw new NotFoundException("TemplateCategory not found");
        }));
    }

    @Override
    public List<TemplateCategoryGetDTO> list(TemplateCategoryCriteria criteria) {
        PageRequest pageRequest = PageRequest.of(criteria.getPage(), criteria.getSize());
        return mapper.fromGetListDTO(repository.findAll(pageRequest).stream().toList());
    }

    @Override
    public Long count() {
        return repository.count();
    }
}
