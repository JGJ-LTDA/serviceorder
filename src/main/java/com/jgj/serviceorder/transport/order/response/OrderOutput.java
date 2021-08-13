package com.jgj.serviceorder.transport.order.response;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class OrderOutput {

    private UUID uuid;

    private String description;
}
