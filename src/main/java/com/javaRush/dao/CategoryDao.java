package com.javaRush.dao;

import com.javaRush.entity.Category;
import org.hibernate.SessionFactory;

public class CategoryDao extends AbstractDao<Category> {
    public CategoryDao(SessionFactory sessionFactory) {
        super(Category.class, sessionFactory);
    }
}
