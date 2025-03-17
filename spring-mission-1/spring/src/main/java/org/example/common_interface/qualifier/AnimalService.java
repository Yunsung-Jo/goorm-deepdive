package org.example.common_interface.qualifier;

import org.example.common_interface.common.animal.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("animalQualifier")
public class AnimalService {

    @Autowired
    @Qualifier("cat")
    private Animal animal;

    public void cry() {
        animal.cry();
    }
}
