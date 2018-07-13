package com.myspringboot.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 这个 main 方法其实就是一个标准的 Javay 应用的入口方法。
 * 其中，@SpringBootApplication 是 Spring Boot 的核心注解，它是一个组合注解，
 * 该注解组合了：@Configuration、@EnableAutoConfiguration、@ComponentScan；
 * 若不是用 @SpringBootApplication 注解也可以使用这三个注解代替。
 *
 * 其中，@EnableAutoConfiguration 让 Spring Boot 根据类路径中的 jar 包依赖为当前项目进行自动配置，
 * 例如，添加了 spring-boot-starter-web 依赖，会自动添加 Tomcat 和 Spring MVC 的依赖，
 * 那么 Spring Boot 会对 Tomcat 和 Spring MVC 进行自动配置。
 *
 * Spring Boot 还会自动扫描 @SpringBootApplication 所在类的同级包以及下级包里的 Bean ，
 * 所以入口类建议就配置在 grounpID + arctifactID 组合的包名下（这里为 com.myspringboot.springboot 包）
 *
 * Spring Boot 不仅支持常规的 properties 配置文件，还支持 yaml 语言的配置文件。
 * yaml 是以数据为中心的语言，在配置数据的时候具有面向对象的特征。
 */
@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
