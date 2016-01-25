package com.examples.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import com.examples.service.CustomerService;

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
	
	@Test
	public void testStartForm() {
		try {
			mockMvc.perform(get("/login"))
			.andExpect(status().isOk())
			.andExpect(forwardedUrl("/WEB-INF/jsp/login.jsp"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
	}
}
