package com.casestudy.project;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.casestudy.project.model.Address;
import com.casestudy.project.model.Product;
import com.casestudy.project.repository.OrderRepository;
import com.casestudy.project.service.OrderService;
import com.casestudy.project.model.Orders;

@RunWith(SpringRunner.class)
@SpringBootTest
class OrderServiceApplicationTests {

	@Test
	void contextLoads() {
	}
	 @Autowired
	    private OrderService orderService;

	    @MockBean
	    private OrderRepository orderRepository;
	    @Test
	    public void getAllOrdersTest()
	    {
	        when(orderRepository.findAll()).thenReturn(Stream.of
	                (new Orders(1,"2021-07-25",123,234.222212,"Paytm","Paid",4,6,"Cloth",123,"swati",345678,23,"delhi","ncr",2334411)
	                        ,new Orders(1,"2021-07-25",123,234.222212,"Paytm","Paid",2,1,"Cloth",123,"swati",345678,23,"delhi","ncr",2334411))
	                .collect(Collectors.toList()));
	        assertEquals(2,orderService.getAllOrders().size());
	    }
	    @Test
	    public void addOrders()
	    {
	    	Orders order = new Orders(1,2021-12-12,10,200.98,"Paytm","paid",3,Arrays.asList(new Product(1,"grocery")),
	    		Arrays.asList(new Address(10,"Swati","1234576","ranchi","Jharkhand","1233456")));
	    when(orderRepository.save(order)).thenReturn(order);
	    assertEquals(order,orderService.addOrder(order));
	    }
	    
	   @Test
	   @Order(1)
	   @Rollback(value = false)
	   public void deleteOrderTest()
	   {
		   orderRepository.deleteById(1);
		   Order employee1 = null;
		   Optional<Order> optionalEmployee = Optional.empty();
		   if(optionalEmployee.isPresent())
		   { 
			   employee1 = optionalEmployee.get(); 
		   }
		   Assertions.assertThat(employee1).isNull(); 
		   }
	   }

