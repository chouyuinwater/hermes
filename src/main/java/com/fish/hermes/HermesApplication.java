package com.fish.hermes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 启动类 it's a long journey, wish you happiness.
 *
 *
 * SpringBootApplication是一个复合注解，
 * ComponentScan 扫描应用Bean
 * SpringBootConfiguration @SpringBootConfiguration继承自@Configuration，二者功能也一致，标注当前类是配置类，
并会将当前类内声明的一个或多个以@Bean注解标记的方法的实例纳入到spring容器中，并且实例名就是方法名。
 * EnableAutoConfiguration 自动加载Spring包
 *
 * EnableTransactionManagement 处理事务
 */
@SpringBootApplication
@EnableTransactionManagement
public class HermesApplication {

	public static void main(String[] args) {
		SpringApplication.run(HermesApplication.class, args);
	}
}
