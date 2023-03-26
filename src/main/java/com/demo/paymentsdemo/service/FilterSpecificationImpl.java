package com.demo.paymentsdemo.service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public Specification<T> getSearchSpecification(List<SearchRequestDto> searchRequestDtos) {
        
        return new Specification<T>(){

            @Override
            @Nullable
            public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                
                List<Predicate> predicates = new ArrayList<>();
                for(SearchRequestDto it:searchRequestDtos)
                {
                    Predicate equal = criteriaBuilder.equal(root.get(it.getColumn()), it.getValue());
                    predicates.add(equal);
                }
                return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
            }
        
        };
    }
    


    
}
