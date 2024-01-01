package com.javaRush.dao;

import com.javaRush.entity.Address;
import org.hibernate.SessionFactory;

public class AddressDao extends AbstractDao<Address> {
    public AddressDao( SessionFactory sessionFactory) {
        super(Address.class, sessionFactory);
    }
}
