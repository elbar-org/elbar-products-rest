package com.elbar.document_agency.repository.templateCategory;

import com.elbar.document_agency.entity.templateCategory.TemplateCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemplateCategoryRepository extends JpaRepository<TemplateCategory, Integer> {
}
