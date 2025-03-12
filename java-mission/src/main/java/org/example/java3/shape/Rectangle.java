package org.example.java3.shape;

public class Rectangle extends Shape {
    public Rectangle(int width, int height, ShapeColor color) {
        super(width, height, color);
    }

    @Override
    double getArea() {
        ShapeSize size = getSize();
        return size.width() * size.height();
    }

    @Override
    public void draw() {
        System.out.println("사각형을 그렸습니다.");
    }
}
