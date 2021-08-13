package com.jgj.serviceorder.transport.order.request;

import com.jgj.serviceorder.domain.Order;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class MapperOrderInputToOrder implements Function<OrderInput, Order> {

    @Override
    public Order apply(OrderInput orderInput) {
        return new ModelMapper().map(orderInput, Order.class);
    }
}
