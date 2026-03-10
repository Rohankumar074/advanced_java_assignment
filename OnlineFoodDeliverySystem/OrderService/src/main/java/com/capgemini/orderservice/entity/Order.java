package com.capgemini.orderservice.entity;

public class Order {

	private Long orderId;
    private Long restaurantId;
    private String customerName;
	
    public Order() {
		super();
	}

	public Order(Long orderId, Long restaurantId, String customerName) {
		super();
		this.orderId = orderId;
		this.restaurantId = restaurantId;
		this.customerName = customerName;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
    
    
    
}
