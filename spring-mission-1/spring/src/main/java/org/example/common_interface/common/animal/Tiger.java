package org.example.common_interface.common.animal;

public class Tiger implements Carnivore {
    private String name;
    private int hunger;

    public Tiger() {
    }

    public Tiger(String name) {
        this.name = name;
        this.hunger = 0;
    }

    @Override
    public String cry() {
        if (hunger - activity >= 0) {
            hunger -= activity;
            return name + "는 어흥! 소리를 냈습니다.";
        } else {
            return name + "는 배가 고파서 울 수 없습니다.";
        }
    }

    @Override
    public String eat() {
        hunger += activity;
        return name + "는 밥을 먹었습니다.";
    }

    @Override
    public String getHunger() {
        return name + "의 허기: " + hunger;
    }

    @Override
    public String toString() {
        return name;
    }
}
