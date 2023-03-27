package com.demo.paymentsdemo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchRequestDto {

    String column;
    String value;
    private Operation operation;

    public enum Operation
    {
        EQUAL,LIKE,IN, GREATER_THAN, LESS_THAN;
    }
    
}
