package org.example.java3;

import java.util.Scanner;

// 문자열 뒤집기 및 대소문자 변환 프로그램 작성하기
public class Application3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원본 문자열: ");
        String s = sc.next();
        System.out.println("문자열 뒤집기: " + stringReverse(s));
        System.out.println("대소문자 바꾸기: " + change(s));
    }

    public static String stringReverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static String change(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char b = s.charAt(i);
            if (Character.isUpperCase(b)) {
                result.append(Character.toLowerCase(b));
            } else {
                result.append(Character.toUpperCase(b));
            }
        }
        return result.toString();
    }
}
