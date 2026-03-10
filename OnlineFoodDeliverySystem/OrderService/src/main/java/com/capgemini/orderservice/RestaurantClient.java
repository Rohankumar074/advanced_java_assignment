package com.capgemini.orderservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "restaurantservice")
public interface RestaurantClient {
    @GetMapping("/restaurants/{id}")
    Object getRestaurantById(@PathVariable Long id);
}