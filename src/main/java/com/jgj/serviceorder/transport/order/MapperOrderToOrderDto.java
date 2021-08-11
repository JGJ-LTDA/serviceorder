package com.jgj.serviceorder.transport.order;

import com.jgj.serviceorder.domain.Order;
import com.jgj.serviceorder.transport.order.dtos.OrderDto;
import org.modelmapper.ModelMapper;

import java.util.function.Function;

public class MapperOrderDtoToOrder implements Function<OrderDto, Order> {

    @Override
    public Order apply(OrderDto orderDto) {
        return new ModelMapper().map(orderDto, Order.class);
    }
}
