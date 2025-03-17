package org.example.common_interface.primary;

import org.example.common_interface.common.animal.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("animalPrimary")
public class AnimalService {
    private final Animal animal;

    @Autowired
    public AnimalService(Animal animal) {
        this.animal = animal;
    }

    public void cry() {
        System.out.println(animal.cry());
    }
}
