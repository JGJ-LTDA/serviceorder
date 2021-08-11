package com.jgj.serviceorder.interactor;

import com.jgj.serviceorder.datasource.order.OrderDataSource;
import com.jgj.serviceorder.domain.Order;
import com.jgj.serviceorder.transport.order.dtos.OrderDto;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public OrderService(OrderDataSource orderDataSource) {
        this.orderDataSource = orderDataSource;
    }

    private final OrderDataSource orderDataSource;

    public Long createOrder(Order order) {

        order.isValid();
        ///

        return orderDataSource.saveOrder(order);

    }

}
