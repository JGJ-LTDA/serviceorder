package com.jgj.serviceorder.transport.order;

import com.jgj.serviceorder.interactor.OrderService;
import com.jgj.serviceorder.transport.order.dtos.OrderDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public Long createOrder(@RequestBody OrderDto orderDto){
        return orderService.createOrder(new MapperOrderDtoToOrder().apply(orderDto));
    }


}
