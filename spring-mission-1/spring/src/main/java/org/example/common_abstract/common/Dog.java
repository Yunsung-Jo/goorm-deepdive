package org.example.common_abstract.common;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void cry() {
        System.out.println("멍! 멍!");
    }
}
