package com.jgj.serviceorder.datasource.order;

import com.jgj.serviceorder.datasource.repository.OrderRepository;
import com.jgj.serviceorder.domain.Order;
import com.jgj.serviceorder.domain.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class OrderDataSource {

    private OrderRepository orderRepository;

    @Autowired
    private MappperOrderEntityToOrder mappperOrderEntityToOrder;

    public OrderDataSource(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Long saveOrder(Order order) {
        return orderRepository.save(new MapperOrderToOrderEntity().apply(order)).getId();
    }

    public Order orderById(Long id) {
        return new MappperOrderEntityToOrder().apply(orderRepository.findById(id).orElseThrow(NotFoundException::new));
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll()
                .stream()
                .map(mappperOrderEntityToOrder)
                .collect(Collectors.toList());
    }

    public Order findOrderByUuid(UUID uuidOrder) {
        return new MappperOrderEntityToOrder().apply(orderRepository.findByUuid(uuidOrder).orElseThrow(NotFoundException::new));
    }
}
