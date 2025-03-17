package org.example.common_abstract.common;

public abstract class Carnivore extends Animal {
    private int hunger;

    public Carnivore() {
    }

    public Carnivore(String name, int age, int hunger) {
        super(name, age);
        this.hunger = hunger;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    @Override
    public String toString() {
        return super.toString() + " 허기: " + hunger;
    }
}
