package com.jgj.serviceorder.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Order {

    private UUID uuid;

    private String description;

    public boolean isValid(){
        return true;
    }
}
