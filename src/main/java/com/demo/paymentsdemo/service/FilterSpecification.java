package com.demo.paymentsdemo.service;

import org.springframework.data.jpa.domain.Specification;

import com.demo.paymentsdemo.dto.SearchRequestDto;

public interface FilterSpecification<T> {

    public Specification<T> getSearchSpecification(SearchRequestDto searchRequestDto);
    
}
