package org.example.java2;

import java.util.Scanner;

// (Java) 사용자로부터 직사각형의 가로와 세로를 입력받아 넓이 출력하기
public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("직사각형의 가로를 입력하세요: ");
        float width = sc.nextFloat();

        System.out.print("직사각형의 세로를 입력하세요: ");
        float height = sc.nextFloat();

        float area = width * height;
        System.out.println("\n직사각형의 넓이는: " + area);
    }
}
