package com.myspringboot.springboot.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 *  1.@MappedSuperclass注解只能标准在类上：@Target({java.lang.annotation.ElementType.TYPE})
 *  2.标注为@MappedSuperclass的类将不是一个完整的实体类，他将不会映射到数据库表，但是他的属性都将映射到其子类的数据库字段中。
 *  3.标注为@MappedSuperclass的类不能再标注@Entity或@Table注解，也无需实现序列化接口。
 *
 * @author ： @gf
 * Create on 2018/6/29 10:35
 */
@MappedSuperclass
@Getter
@Setter
public class SuperEntity implements Serializable{
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid",strategy = "uuid")
    @Column(length = 64)
    private String id;
    @Column(nullable = true)
    private Date createTime;
    @Version
    private Date version;
}
