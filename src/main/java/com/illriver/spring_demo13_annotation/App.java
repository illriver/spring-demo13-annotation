package com.illriver.spring_demo13_annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 主体类
 *
 */
public class App {
    public static void main( String[] args ){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService demoService = context.getBean(DemoService.class);
        demoService.outputResult();
        context.close();
    }
}
