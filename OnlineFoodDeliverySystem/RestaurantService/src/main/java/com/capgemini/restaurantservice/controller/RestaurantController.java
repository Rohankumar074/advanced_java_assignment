package com.capgemini.restaurantservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.restaurantservice.entity.Restaurant;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {
	
	private List<Restaurant> restaurants=new ArrayList<>();
	
	public RestaurantController() {
        restaurants.add(new Restaurant((long) 101, "Spice Symphony", "123 Flavor Street", "Indian"));
    }
	
	@GetMapping
	public List<Restaurant> getAllRestaurants(){
		return restaurants;
	}
	
	@GetMapping("/{id}")
	public Restaurant getRestaurantById(@PathVariable Long id) {
		return restaurants.stream()
	            .filter(r -> r.getId().equals(id))
	            .findFirst()
	            .orElseThrow(() -> new RuntimeException("Restaurant not found"));
		
	}
	
	@PostMapping
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
        restaurants.add(restaurant);
        return restaurant;
    }
	

}
