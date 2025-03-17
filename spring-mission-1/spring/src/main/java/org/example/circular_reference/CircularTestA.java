package org.example.circular_reference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class CircularTestA {
    private CircularTestB circularTestB;

    // CircularTestA의 생성자에 @Lazy를 추가해 순환 참조를 피할 수 있다.
    @Autowired
    public CircularTestA(@Lazy CircularTestB circularTestB) {
        this.circularTestB = circularTestB;
    }
}
