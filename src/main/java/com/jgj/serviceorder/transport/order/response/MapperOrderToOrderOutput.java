package com.jgj.serviceorder.transport.order.response;

import com.jgj.serviceorder.domain.Order;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class MapperOrderToOrderOutput implements Function<Order, OrderOutput> {
    @Override
    public OrderOutput apply(Order order) {
        return  new ModelMapper().map(order, OrderOutput.class);
    }
}
