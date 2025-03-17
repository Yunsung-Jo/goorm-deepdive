package org.example.common_interface.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("org.example.common_interface");

        AnimalService animalService = context.getBean("animalQualifier", AnimalService.class);
        animalService.cry();
    }
}
