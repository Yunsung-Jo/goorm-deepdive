package org.example.java2;

// (Java) 1부터 10까지의 숫자 배열 출력하기
public class Application5 {
    public static void main(String[] args) {
        int[] array = getArray(1, 10);
        print(array);
    }

    public static int[] getArray(int start, int end) {
        int[] array = new int[end - start + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + start;
        }
        return array;
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
