package com.examples.service;

import com.examples.exception.InvalidCredentialsException;
import com.examples.model.Customer;

public interface CustomerService {
	public Customer validateCustomer(Customer customer) throws InvalidCredentialsException;
}
