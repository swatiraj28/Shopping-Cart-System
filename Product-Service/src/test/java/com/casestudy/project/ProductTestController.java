package com.casestudy.project;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.casestudy.project.controller.ProductResource;
import com.casestudy.project.repository.ProductRepository;

@WebMvcTest(ProductResource.class)
public class ProductTestController {
		@MockBean
		  private ProductRepository productRepository;
		//@Autowired
		//private WebApplicationContext webApplicationContext;
		
		
		@Autowired
		private MockMvc mockMvc;
		@Test
		void shouldCreateMockMvc() {
		assertNull(mockMvc);
}
}


