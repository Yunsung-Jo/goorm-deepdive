package org.example.common_interface.common.animal;

// 육식 동물
public interface Carnivore extends Animal {
    int activity = 10;

    String eat();

    String getHunger();
}
