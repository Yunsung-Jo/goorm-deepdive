package org.example.common_interface.common.animal;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dog implements Animal {

    @Override
    public String cry() {
        return "멍! 멍!";
    }
}
