package com.casestudy.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.project.model.Orders;
import com.casestudy.project.service.OrderService;

@RestController
@RequestMapping("/api/order")
public class OrderController {
	
	@Autowired
	OrderService orderservice;

	
	//For Getting all Orders Details
   @GetMapping("/getallorders")
	public List<Orders> getAllOrders(){

	return orderservice.getAllOrders();
	}
    
   
    // For placing an Order
    @PostMapping("/addorder")
	public Orders addOrder(@RequestBody  Orders orders) {

	return orderservice.addOrder(orders);
	}

    //For Deleting order using orderId
    @DeleteMapping("/deletebyID/{orderId}")
	public String deleteOrder(@PathVariable int orderId) {

	return orderservice.deleteOrder(orderId);
	}

    
    //For updating order details using orderId
	@PutMapping("/updateorderbyID/{orderId}")
	public String updateOrder(@RequestBody Orders orders ,@PathVariable int orderId) {

	return orderservice.updateOrder(orders, orderId);
	}
	
	//Getting all order info using orderId
	@GetMapping("/getbyID/{orderId}")
	public Optional<Orders> getOrderById(@PathVariable int orderId){
	return orderservice.getOrderById(orderId);
	}



	}


