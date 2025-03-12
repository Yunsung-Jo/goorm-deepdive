package org.example.java3.company;

public class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void job() {
        System.out.println("열심히 일을 하고 있습니다.");
    }
}
