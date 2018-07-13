package com.myspringboot.springboot.controller;

import com.myspringboot.springboot.core.ViewDataPage;
import com.myspringboot.springboot.entity.User;
import com.myspringboot.springboot.service.UserService;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author ： @gf
 * Create on 2018/6/29 10:01
 */
@RestController
@RequestMapping("/user")
@Transactional
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public Object findAllList(@QuerydslPredicate(root = User.class)Predicate predicate, String s, Pageable
            pageable){
        return ViewDataPage.of(userService.findAll(predicate, pageable));
    }
}
