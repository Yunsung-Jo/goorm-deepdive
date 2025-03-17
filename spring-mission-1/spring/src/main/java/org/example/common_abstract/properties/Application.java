package org.example.common_abstract.properties;

import org.example.common_abstract.common.Animal;
import org.example.common_abstract.common.Dog;
import org.example.common_abstract.common.Tiger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ContextConfiguration.class);

        Animal dog = context.getBean("dog", Dog.class);
        System.out.println(dog);

        Animal tiger = context.getBean("tiger", Tiger.class);
        System.out.println(tiger);
    }
}
