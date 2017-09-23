package com.examples.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import com.examples.exception.InvalidCredentialsException;
import com.examples.model.Customer;
import com.examples.service.CustomerService;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
@WebAppConfiguration
public class BankControllerTest {

	@InjectMocks
	private BankController bankController;
	
	@Mock
	private CustomerService customerService;
	
	private MockMvc mockMvc;
	
	@Before
	public void setUp() throws Exception{
		System.out.println("Before is called");
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testStartForm() {		
		try {
			Mockito.when(customerService.validateCustomer(Matchers.any(Customer.class))).thenThrow(InvalidCredentialsException.class);
			mockMvc.perform(get("/login"))
			.andExpect(status().isOk())
			.andExpect(forwardedUrl("/WEB-INF/jsp/login.jsp"));
		} catch (Exception e) {
			Assert.fail("This should not be called");
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
	}
}
