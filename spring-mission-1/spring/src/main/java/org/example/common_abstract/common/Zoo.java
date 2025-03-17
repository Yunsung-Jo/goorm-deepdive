package org.example.common_abstract.common;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private final List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
