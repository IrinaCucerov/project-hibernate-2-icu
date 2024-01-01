package com.javaRush.dao;

import com.javaRush.entity.Customer;
import org.hibernate.SessionFactory;

public class CustomerDao extends AbstractDao<Customer> {
    public CustomerDao(SessionFactory sessionFactory) {
        super(Customer.class, sessionFactory);
    }
}
