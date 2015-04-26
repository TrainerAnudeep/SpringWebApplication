package com.examples.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.examples.service.CustomerService;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(MockitoJUnitRunner.class)
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
			//e.printStackTrace();
		}
	}
	
	@Test
	public void test2(){
		assertTrue(true);
	}

}
