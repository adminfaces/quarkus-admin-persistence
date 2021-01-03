package com.github.quarkus.criteria.runtime.entitymanager;

import org.apache.deltaspike.jpa.spi.entitymanager.ActiveEntityManagerHolder;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Dependent
public class ActiveEntityManagerHolderImpl implements ActiveEntityManagerHolder {

    @Inject
    private EntityManager entityManager;

    @Override
    public void set(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public boolean isSet() {
        return entityManager != null;
    }

    @Override
    public EntityManager get() {
        return entityManager;
    }

    @Override
    public void dispose() {
    }
}
