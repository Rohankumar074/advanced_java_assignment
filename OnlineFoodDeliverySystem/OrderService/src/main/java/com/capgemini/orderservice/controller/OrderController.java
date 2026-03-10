package com.capgemini.orderservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.orderservice.RestaurantClient;
import com.capgemini.orderservice.entity.Order;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final List<Order> orders = new ArrayList<>();
    private final RestaurantClient restaurantClient;

    public OrderController(RestaurantClient restaurantClient) {
        this.restaurantClient = restaurantClient;
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        restaurantClient.getRestaurantById(order.getRestaurantId()); 
        
        orders.add(order);
        return order;
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orders;
    }
}