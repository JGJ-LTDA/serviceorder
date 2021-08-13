package com.jgj.serviceorder.datasource.order;

import com.jgj.serviceorder.datasource.entities.OrderEntity;
import com.jgj.serviceorder.domain.Order;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
class MapperOrderToOrderEntity implements Function<Order, OrderEntity> {

    @Override
    public OrderEntity apply(Order order) {
        return new ModelMapper().map(order, OrderEntity.class);
    }
}
