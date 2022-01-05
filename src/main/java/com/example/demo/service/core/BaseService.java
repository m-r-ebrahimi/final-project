package com.example.demo.service.core;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class BaseService<T, ID> {

    private JpaRepository<T, ID> jpaRepository;

    public void setJpaRepository(JpaRepository<T, ID> jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void save(T entity) {
        jpaRepository.save(entity);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void update(T entity) {
        jpaRepository.save(entity);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void delete(T entity) {
        jpaRepository.delete(entity);
    }


    @Transactional
    public List<T> loadAll() {
        return jpaRepository.findAll();
    }
}

