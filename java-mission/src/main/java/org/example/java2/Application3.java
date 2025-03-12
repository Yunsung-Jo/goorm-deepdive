package org.example.java2;

import java.util.Scanner;

// (Java) 두 개의 정수를 더하고 빼는 메서드 작성하기
public class Application3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int a = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int b = sc.nextInt();

        System.out.println("두 숫자의 합: " + add(a, b));
        System.out.println("두 숫자의 차: " + sub(a, b));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }
}
