package com.examples.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.examples.model.Customer;

@Controller
public class BankController {

	@RequestMapping(value = "/login", method= RequestMethod.GET)
	public ModelAndView startForm(){
		return new ModelAndView("login", "customer", new Customer());
	}
	
	@RequestMapping(value="/validateCustomer", method=RequestMethod.POST)
	public String customerLogin(@ModelAttribute("customer")Customer customer, ModelMap model){
		model.addAttribute(customer.getUsername());
		model.addAttribute(customer.getPwd());
		model.addAttribute(customer.getUserId());

		return "welcomePage";
	}
}
