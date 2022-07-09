package com.elbar.document_agency.criteria;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Sort;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GenericCriteria {
    private Integer size;
    private Integer page;
    private Sort.Direction direction;

    public Integer getPage() {
        if (Objects.isNull(page))
            page = 0;
        return page;
    }

    public Integer getSize() {
        if (Objects.isNull(size))
            size = 10;
        return size;
    }

    public Sort.Direction getSort() {
        if (Objects.isNull(direction)) {
            direction = Sort.Direction.ASC;
        }
        return direction;
    }
}
