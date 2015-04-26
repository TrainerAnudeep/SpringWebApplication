package com.examples.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.examples.exception.InvalidCredentialsException;
import com.examples.model.Customer;
import com.examples.service.CustomerService;

@Controller
public class BankController {
	
	private static final Logger LOG = Logger.getLogger(BankController.class);
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "/login", method= RequestMethod.GET)
	public ModelAndView startForm(){
		LOG.debug("Instantiating form and passing it to login view.");
		return new ModelAndView("login", "customer", new Customer());
	}
	
	@RequestMapping(value="/validateCustomer", method=RequestMethod.POST)
	public String customerLogin(@ModelAttribute("customer")Customer customer, ModelMap model){
		LOG.debug("Received customer input with: "+customer);
		
		try {
			Customer resp = customerService.validateCustomer(customer);
			
			model.addAttribute("username", resp.getName());
			model.addAttribute("pwd", resp.getPassword());
			model.addAttribute("userId", resp.getId());
			
		} catch (InvalidCredentialsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "login";
		}
		
		return "welcomePage";
	}
}
