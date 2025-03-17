package org.example.common_abstract.scope.prototype;

import org.example.common_abstract.common.Animal;
import org.example.common_abstract.common.Cat;
import org.example.common_abstract.common.Dog;
import org.example.common_abstract.common.Tiger;
import org.example.common_abstract.common.Zoo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ContextConfiguration {

    @Bean
    public Animal dog() {
        return new Dog("강아지", 5);
    }

    @Bean
    public Animal cat() {
        return new Cat("고양이", 3);
    }

    @Bean
    public Animal tiger() {
        return new Tiger("호랑이", 10, 100);
    }

    @Bean
    @Scope("prototype")
    public Zoo prototypeZoo() {
        return new Zoo();
    }
}
