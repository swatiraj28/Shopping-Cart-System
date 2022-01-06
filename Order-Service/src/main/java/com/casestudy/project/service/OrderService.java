package com.casestudy.project.service;

import java.util.List;
import java.util.Optional;

import com.casestudy.project.model.Orders;

public interface OrderService { // to provide loose coupling 
	
	List<Orders> getAllOrders();
	Orders addOrder(Orders orders);
	String deleteOrder(int orderId );
	String updateOrder(Orders orders , int orderId);

	Optional<Orders> getOrderById(int orderId);
}
