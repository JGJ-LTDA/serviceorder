package com.jgj.serviceorder.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {

    private Long id;

    public boolean isValid(){
        return true;
    }
}
