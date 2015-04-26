package com.examples.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.dao.CustomerDao;
import com.examples.exception.InvalidCredentialsException;
import com.examples.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public Customer validateCustomer(Customer customer) throws InvalidCredentialsException {
		
		if(customer!=null){
			List<Customer> respList = customerDao.list();
			if(respList!=null){
				for(Customer cust:respList){
					if(cust.getId().equalsIgnoreCase(customer.getId()) && 
							cust.getPassword().equalsIgnoreCase(customer.getPassword())){
						return cust;
					}
				}
				
				throw new InvalidCredentialsException("Login credentials are invalid, please try again");
			}
		}
		
		return null;
	}

}
