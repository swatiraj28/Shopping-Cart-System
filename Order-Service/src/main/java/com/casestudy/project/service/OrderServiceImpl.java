package com.casestudy.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import com.casestudy.project.exceptionhandling.OrderNotFoundException;

import com.casestudy.project.model.Orders;

import com.casestudy.project.repository.OrderRepository;

public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrderRepository orderRepository;

	@Override
	public List<Orders> getAllOrders() {
		List<Orders> orders= orderRepository.findAll();
		if(orders.isEmpty()) {
			throw new OrderNotFoundException("501","Order not Found !! Nothing to Display");
		}else
		{
			return orders;
			
		}
	}

	@Override
	public Orders addOrder(Orders orders) {
		if(orders.getProducts().isEmpty())
		{
			throw new OrderNotFoundException("503"," No Products are added in cart !! Please check ");
		}
		else if(orders.getAddress().isEmpty()) 
		{
			throw new OrderNotFoundException("503"," Address field is Empty !! Check Again ");
		}
		else 
		{
			
			return orderRepository.save(orders);
		}

	}

	@Override
	public String deleteOrder(int orderId) 
	{
		boolean isOrderExist= orderRepository.existsById(orderId);
		if(isOrderExist)
		{
		   orderRepository.deleteById(orderId);
		    return "Order deleted by Id" + orderId;
		}
		else 
		{
			throw new OrderNotFoundException("505" ,"OOPS !! Cannot find order with provided Id");
		}
	}

	@Override
	public String updateOrder(Orders orders, int orderId) {
		boolean isOrderExist = orderRepository.existsById(orderId);
		if(isOrderExist)
		{
		    orderRepository.save(orders);
		    return "Order Updated Successfully " + orderId;
		}
		else
		{
			throw new OrderNotFoundException("504" ,"No Order found with this Id !! Check Again");
		}
	}

	@Override
	public Optional<Orders> getOrderById(int orderId) 
	{
		Optional<Orders> findByid =orderRepository.findById(orderId);
	    if(findByid.isEmpty())
		{
			throw new OrderNotFoundException("502" ,"Order not Found with Provided Id !! Check Again");
		}
		else
		{
			return orderRepository.findById(orderId);
			
		}
	}


	
	
	}
	
	
	

