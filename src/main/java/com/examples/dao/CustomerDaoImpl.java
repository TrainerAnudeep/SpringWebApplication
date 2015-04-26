package com.examples.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.examples.model.Customer;

public class CustomerDaoImpl implements CustomerDao {

	private SessionFactory sessionFactory;
	
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public void save(Customer c) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(c);
        tx.commit();
        session.close();
    }
 
    @SuppressWarnings("unchecked")
    @Override
    public List<Customer> list() {
        Session session = this.sessionFactory.openSession();
        List<Customer> personList = session.createQuery("from Customer").list();
        session.close();
        return personList;
    }

}
