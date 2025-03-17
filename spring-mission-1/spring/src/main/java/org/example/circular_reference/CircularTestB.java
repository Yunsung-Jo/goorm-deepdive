package org.example.circular_reference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CircularTestB {
    private CircularTestA circularTestA;

    @Autowired
    public CircularTestB(CircularTestA circularTestA) {
        this.circularTestA = circularTestA;
    }
}
