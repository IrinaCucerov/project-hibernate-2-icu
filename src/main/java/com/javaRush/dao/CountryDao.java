package com.javaRush.dao;

import com.javaRush.entity.Country;
import org.hibernate.SessionFactory;

public class CountryDao extends AbstractDao<Country> {
    public CountryDao(SessionFactory sessionFactory) {
        super(Country.class, sessionFactory);
    }
}
