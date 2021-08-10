package com.jgj.serviceorder.datasource.order;

import com.jgj.serviceorder.datasource.repository.OrderRepository;
import com.jgj.serviceorder.domain.Order;
import com.jgj.serviceorder.domain.exception.NotFoundException;
import org.springframework.stereotype.Component;

@Component
public class OrderDataSource {

    private OrderRepository orderRepository;

    public OrderDataSource(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Long saveOrder(Order order) {
        return orderRepository.save(new MapperOrderToOrderEntity().apply(order)).getId();
    }

    public Order orderById(Long id) {
        return new MappperOrderEntityToOrder().apply(orderRepository.findById(id).orElseThrow(NotFoundException::new));
    }

}
