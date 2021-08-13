package com.jgj.serviceorder.transport.order.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class OrderInput {

    @NotBlank
    private String description;
}
