package org.example.common_abstract.common;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void cry() {
        System.out.println("야옹~ 야옹~");
    }
}
