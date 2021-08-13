package com.jgj.serviceorder.interactor;

import com.jgj.serviceorder.datasource.order.OrderDataSource;
import com.jgj.serviceorder.domain.Order;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

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


    public List<Order> findAllOrders(){
        return orderDataSource.getAllOrders();
    }

    public Order findOrderByUuid(UUID uuidOrder) {
        return orderDataSource.findOrderByUuid(uuidOrder);
    }
}
