package org.example.java3.shape;

public class Circle extends Shape {
    public Circle(int radius, ShapeColor color) {
        super(radius, radius, color);
    }

    @Override
    double getArea() {
        ShapeSize size = getSize();
        return Math.pow(size.width(), 2) * 3.14;
    }

    @Override
    public void draw() {
        System.out.println("원을 그렸습니다.");
    }
}
