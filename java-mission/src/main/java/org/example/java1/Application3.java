package org.example.java1;

import java.util.Scanner;

// (Java) 사용자로부터 두 숫자를 입력받아 합계 출력하는 Java 프로그램 작성하기
public class Application3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int a = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요 : ");
        int b = sc.nextInt();

        System.out.println("합계 : " + sum(a, b));
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
