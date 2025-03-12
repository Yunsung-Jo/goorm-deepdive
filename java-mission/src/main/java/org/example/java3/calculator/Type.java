package org.example.java3.calculator;

public enum Type {
    PLUS((a, b) -> a + b),
    MINUS((a, b) -> a - b),
    MULTIPLY((a, b) -> a * b),
    DIVIDE((a, b) -> a / b);

    private final Calc calc;

    Type(Calc calc) {
        this.calc = calc;
    }

    public Calc getCalc() {
        return calc;
    }
}
