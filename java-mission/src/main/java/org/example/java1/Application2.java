package org.example.java1;

import java.util.Scanner;

// (Java) 사용자로부터 두 숫자를 입력받고, 더 큰 숫자 출력하기
public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int a = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요 : ");
        int b = sc.nextInt();

        int max = a > b ? a : b;
        System.out.println("더 큰 숫자는 " + max + " 입니다.");
    }
}
