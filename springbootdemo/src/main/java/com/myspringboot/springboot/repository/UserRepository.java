package com.myspringboot.springboot.repository;

import com.myspringboot.springboot.entity.User;

import java.util.List;

/**
 * @author ： @gf
 * Create on 2018/6/29 9:45
 */
public interface UserRepository extends BaseRepository<User> {
    List<User> findByAgeIn(String[] ageArr);
}
