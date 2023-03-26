package com.demo.paymentsdemo.service;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import com.demo.paymentsdemo.dto.SearchRequestDto;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

@Service
public class FilterSpecificationImpl<T> implements FilterSpecification<T>{

    @Override
    public Specification<T> getSearchSpecification(SearchRequestDto searchRequestDto) {

        return new Specification<T>() {

            @Override
            @Nullable
            public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {

                return criteriaBuilder.equal(root.get(searchRequestDto.getColumn()), searchRequestDto.getValue());
                
            }
        };
    }
    


    
}
