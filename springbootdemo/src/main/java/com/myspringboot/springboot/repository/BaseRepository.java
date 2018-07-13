package com.myspringboot.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author ： @gf
 * Create on 2018/6/29 9:15
 * 添加@NoRepositoryBean标注，这样Spring Data Jpa在启动时就不会去实例化BaseRepository这个接口
 * @param <T>
 */
@NoRepositoryBean
public interface BaseRepository<T> extends JpaRepository<T,String>,QuerydslPredicateExecutor<T> {
}
