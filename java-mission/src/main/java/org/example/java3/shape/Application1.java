package org.example.java3.shape;

import java.util.Random;

public class Application1 {
    public static void main(String[] args) {
        Random random = new Random();

        Rectangle rectangle = new Rectangle(10, 5, ShapeColor.RED);
        Circle circle = new Circle(15, ShapeColor.GREEN);

        Shape[] shapes = {rectangle, circle};
        for (Shape shape : shapes) {
            shape.draw();
            shape.printInfo();

            int width = random.nextInt(100) + 1;
            int height = random.nextInt(100) + 1;
            ShapeSize size = new ShapeSize(width, height);
            shape.setShapeSize(size);

            shape.printInfo();
        }
    }
}
