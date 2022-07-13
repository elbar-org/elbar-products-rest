package com.elbar.document_agency.repository.templateCategory;

import com.elbar.document_agency.entity.templateCategory.TemplateCategoryEntity;
import com.elbar.document_agency.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface TemplateCategoryRepository extends JpaRepository<TemplateCategoryEntity, Integer>, BaseRepository {
    Optional<TemplateCategoryEntity> findByCode(UUID code);
}
