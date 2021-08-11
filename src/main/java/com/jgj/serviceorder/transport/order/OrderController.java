package com.jgj.serviceorder.transport.order;

import com.jgj.serviceorder.interactor.OrderService;
import com.jgj.serviceorder.transport.order.dtos.OrderDto;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{orderId}")
    public OrderDto buscar(@PathVariable Long orderId) {
        return new MapperOrderToOrderDto().apply(orderService.findOrderById(orderId));
    }


}
