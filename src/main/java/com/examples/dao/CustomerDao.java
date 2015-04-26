package com.examples.dao;

import java.util.List;

import com.examples.model.Customer;

public interface CustomerDao {

	public void save(Customer customer);
	public List<Customer> list();
}
