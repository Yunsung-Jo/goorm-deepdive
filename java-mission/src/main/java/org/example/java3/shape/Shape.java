package org.example.java3.shape;

public abstract class Shape implements IShape {
    private ShapeSize size;
    private final ShapeColor color;

    public Shape(int width, int height, ShapeColor color) {
        this.size = new ShapeSize(width, height);
        this.color = color;
    }

    abstract double getArea();

    public void setShapeSize(ShapeSize size) {
        this.size = size;
        System.out.println("도형의 크기가 변경되었습니다.");
        System.out.println(size);
        System.out.println();
    }

    public ShapeSize getSize() {
        return size;
    }

    @Override
    public ShapeColor getColor() {
        return color;
    }

    public void printInfo() {
        System.out.println(size);
        System.out.println(color);
        System.out.println("도형의 넓이는 " + getArea() + "입니다.");
        System.out.println();
    }
}
