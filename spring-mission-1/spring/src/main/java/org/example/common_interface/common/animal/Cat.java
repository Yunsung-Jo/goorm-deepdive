package org.example.common_interface.common.animal;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

    @Override
    public String cry() {
        return "야옹~ 야옹~";
    }
}
