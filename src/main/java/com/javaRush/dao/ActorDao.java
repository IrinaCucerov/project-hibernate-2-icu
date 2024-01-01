package com.javaRush.dao;

import com.javaRush.entity.Actor;
import org.hibernate.SessionFactory;

public class ActorDao extends AbstractDao<Actor> {
    public ActorDao(SessionFactory sessionFactory) {
        super(Actor.class, sessionFactory);
    }
}
