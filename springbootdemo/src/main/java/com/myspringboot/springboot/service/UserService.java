package com.myspringboot.springboot.service;

import com.myspringboot.springboot.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author ： @gf
 * Create on 2018/6/29 9:49
 */
@Service
@Transactional
public class UserService extends BaseService<User>{

}
