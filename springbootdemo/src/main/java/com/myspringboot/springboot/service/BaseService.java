package com.myspringboot.springboot.service;

import com.myspringboot.springboot.repository.BaseRepository;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


/**
 * @author ： @gf
 * Create on 2018/6/29 9:50
 */
public class BaseService<T> {
    @Autowired
    protected BaseRepository<T> baseRepository;

    public Iterable<T> findAll(Predicate predicate){
        return baseRepository.findAll(predicate);
    }

    public Page<T> findAll(Predicate predicate, Pageable pageable){
        return baseRepository.findAll(predicate, pageable);
    }

    public List<T> findAll(){
        return baseRepository.findAll();
    }

    public <S extends T> S save(S entity){
        return baseRepository.save(entity);
    }

    public boolean exists(Predicate predicate){
        return baseRepository.exists(predicate);
    }
}
