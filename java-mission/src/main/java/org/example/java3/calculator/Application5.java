package org.example.java3.calculator;

import java.util.Scanner;

// 람다 표현식을 활용한 간단한 계산기 프로그램 작성하기
// 예외 처리가 포함된 계산기 프로그램 작성하기
public class Application5 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("계산식을 입력하세요: ");
            String s = sc.nextLine();

            Calculator calculator = new Calculator();
            double result = calculator.calc(s);
            System.out.println("결과값: " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
