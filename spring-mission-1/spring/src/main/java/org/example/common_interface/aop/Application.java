package org.example.common_interface.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("org.example.common_interface.aop");

        ZooService zooService = context.getBean("zooService", ZooService.class);
        System.out.println(zooService.selectZookeepers());
        System.out.println(zooService.selectZookeeper(1));
        // System.out.println(zooService.selectZookeeper(5));
    }
}
