package org.example.java3.company;


public abstract class Employee {
    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    public void goToWork() {
        System.out.println(name + "님이 출근하였습니다.");
    }

    public void leaveWork() {
        System.out.println(name + "님이 퇴근하였습니다.\n");
    }

    abstract public void job();
}
