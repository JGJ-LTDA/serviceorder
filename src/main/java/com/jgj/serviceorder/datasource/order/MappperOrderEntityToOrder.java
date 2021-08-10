package com.jgj.serviceorder.datasource.order;

import com.jgj.serviceorder.datasource.entities.OrderEntity;
import com.jgj.serviceorder.domain.Order;
import org.modelmapper.ModelMapper;

import java.util.function.Function;

class MappperOrderEntityToOrder implements Function<OrderEntity, Order> {

    @Override
    public Order apply(OrderEntity orderEntity) {
        return new ModelMapper().map(orderEntity, Order.class);
    }
}
