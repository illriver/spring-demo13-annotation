package com.illriver.spring_demo13_annotation;

import org.springframework.stereotype.Service;

/**
 * 演示服务的Bean
 * @author Pactera
 *
 */
@Service
public class DemoService {
	public void outputResult() {
		System.out.println("从组合注解配置照样获得的bean");
	}
}
