package org.example.common_abstract.common;

import org.springframework.stereotype.Component;

@Component
public class Tiger extends Carnivore {

    public Tiger() {
    }

    public Tiger(String name, int age, int hunger) {
        super(name, age, hunger);
    }

    @Override
    public void cry() {
        System.out.println("어흥! 어흥!");
    }
}
