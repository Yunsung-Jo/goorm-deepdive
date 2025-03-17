package org.example.common_abstract.properties;

import org.example.common_abstract.common.Animal;
import org.example.common_abstract.common.Dog;
import org.example.common_abstract.common.Tiger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("animal/animal-info.properties")
public class ContextConfiguration {
    @Value("${animal.dog.name}")
    private String dogName;

    @Value("${animal.dog.age}")
    private int dogAge;

    @Bean
    public Animal dog() {
        return new Dog(dogName, dogAge);
    }

    @Bean
    public Animal tiger(
            @Value("${carnivore.tiger.name}") String name,
            @Value("${carnivore.tiger.age}") int age,
            @Value("${carnivore.tiger.hunger}") int hunger
    ) {
        return new Tiger(name, age, hunger);
    }
}
