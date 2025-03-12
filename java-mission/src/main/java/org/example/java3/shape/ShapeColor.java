package org.example.java3.shape;

public enum ShapeColor {
    RED("빨간색"),
    GREEN("초록색"),
    BLUE("파란색"),
    YELLOW("노란색"),
    BLACK("검정색"),
    WHITE("하얀색");

    private final String colorName;

    ShapeColor(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }

    @Override
    public String toString() {
        return "색상은 " + colorName + "입니다.";
    }
}
