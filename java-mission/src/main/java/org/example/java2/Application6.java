package org.example.java2;

import java.util.Scanner;

// (Java) 홀수/짝수 판별 프로그램 작성하기
public class Application6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\n숫자를 입력하세요: ");
            int num = sc.nextInt();
            if (num <= 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            calc(num);
        }
    }

    public static void calc(int num) {
        if (num % 2 == 0) {
            System.out.println("입력하신 숫자는 짝수입니다.");
        } else {
            System.out.println("입력하신 숫자는 홀수입니다.");
        }
    }
}
