package com.jgj.serviceorder.transport.order.dtos;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class OrderDto {

    private Long id;

    private BigDecimal valor;
}
