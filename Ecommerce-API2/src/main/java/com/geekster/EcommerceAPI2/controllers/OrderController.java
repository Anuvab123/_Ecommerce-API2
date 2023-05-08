package com.geekster.EcommerceAPI2.controllers;

import com.geekster.EcommerceAPI2.models.Order;
import com.geekster.EcommerceAPI2.repository.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @Autowired
    IOrderRepository orderRepository;

    @PostMapping(value="/order")
    public void createOrder(@RequestBody Order order){
        orderRepository.save(order);
    }

    @GetMapping(value="/order/{id}")
    public Order getOrderById(@PathVariable Integer id){
        return orderRepository.findOrderByOrderId(id);
    }
}
