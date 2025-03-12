package org.example.java3.shape;

public record ShapeSize(int width, int height) {
    @Override
    public String toString() {
        return "너비는 " + width + "이고 높이는 " + height + "입니다.";
    }
}
