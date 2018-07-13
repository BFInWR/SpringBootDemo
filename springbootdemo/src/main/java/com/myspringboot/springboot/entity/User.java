package com.myspringboot.springboot.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * @author ： @gf
 * Create on 2018/6/29 9:17
 */

@Entity
@Setter
@Getter
public class User extends SuperEntity{
    private String name;
    private int age;
}
