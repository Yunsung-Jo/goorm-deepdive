package org.example.common_abstract.initdestroy;

import org.example.common_abstract.common.Animal;
import org.example.common_abstract.common.Zoo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ContextConfiguration.class);

        Animal dog = context.getBean("dog", Animal.class);
        Animal cat = context.getBean("cat", Animal.class);
        Animal tiger = context.getBean("tiger", Animal.class);

        Zoo zoo1 = context.getBean(Zoo.class);
        zoo1.addAnimal(dog);
        zoo1.addAnimal(cat);
        System.out.println("첫 번째 동물원: " + zoo1.getAnimals());

        Zoo zoo2 = context.getBean(Zoo.class);
        zoo2.addAnimal(tiger);
        zoo2.addAnimal(dog);
        System.out.println("두 번째 동물원: " + zoo2.getAnimals());

        ((AnnotationConfigApplicationContext) context).close();
    }
}
