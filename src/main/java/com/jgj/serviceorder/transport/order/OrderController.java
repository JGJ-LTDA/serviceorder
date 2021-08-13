package com.jgj.serviceorder.transport.order;

import com.jgj.serviceorder.interactor.OrderService;
import com.jgj.serviceorder.transport.order.request.MapperOrderInputToOrder;
import com.jgj.serviceorder.transport.order.request.OrderInput;
import com.jgj.serviceorder.transport.order.response.MapperOrderToOrderOutput;
import com.jgj.serviceorder.transport.order.response.OrderOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    private MapperOrderToOrderOutput mapperOrderToOrderOutput;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Long createOrder(@RequestBody @Valid OrderInput orderInput) {
        return orderService.createOrder(new MapperOrderInputToOrder().apply(orderInput));
    }

    @GetMapping("/{externalId}")
    public OrderOutput findOrder(@PathVariable UUID externalId) {
        return new MapperOrderToOrderOutput().apply(orderService.findOrderByUuid(externalId));
    }

    @GetMapping
    public List<OrderOutput> findAllOrders() {
        return orderService.findAllOrders()
                .stream()
                .map(mapperOrderToOrderOutput)
                .collect(Collectors.toList());
    }

}
