package com.jgj.serviceorder.transport.order;

import com.jgj.serviceorder.domain.Order;
import com.jgj.serviceorder.transport.order.dtos.OrderDto;
import org.modelmapper.ModelMapper;

import java.util.function.Function;

public class MapperOrderToOrderDto implements Function<Order, OrderDto> {


    @Override
    public OrderDto apply(Order order) {
        return  new ModelMapper().map(order, OrderDto.class);
    }
}
