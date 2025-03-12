package org.example.java3.calculator;

public class Calculator {
    public double calc(String s) throws Exception {
        String[] sp = s.split(" ");
        double sum;
        try {
            sum = numberCheck(sp[0]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("문자로 시작할 수 없습니다.");
        }
        for (int i = 1; i < sp.length - 1; i++) {
            Type t = null;
            switch (sp[i]) {
                case "+" -> t = Type.PLUS;
                case "-" -> t = Type.MINUS;
                case "*" -> t = Type.MULTIPLY;
                case "/" -> t = Type.DIVIDE;
            }
            if (t != null) {
                sum = calcOne(sum, numberCheck(sp[i + 1]), t);
            }
        }
        return sum;
    }

    private int numberCheck(String s) throws NumberFormatException {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("숫자가 아닙니다.");
        }
    }

    private double calcOne(double a, double b, Type type) {
        return type.getCalc().calc(a, b);
    }
}
