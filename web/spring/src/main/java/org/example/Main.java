package org.example;

import org.example.common.ItemDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static final String resourceLocation = "xmlconfig/spring-context.xml";

    public static void main(String[] args) {
        // XML
        ApplicationContext context = new GenericXmlApplicationContext(resourceLocation);
        ItemDTO itemDTO1 = context.getBean("item01", ItemDTO.class);
        System.out.println(itemDTO1);

        // 자바
        context = new AnnotationConfigApplicationContext(ContextConfiguration.class);
        ItemDTO itemDTO2 = context.getBean("getItem", ItemDTO.class);
        System.out.println(itemDTO2);
    }
}