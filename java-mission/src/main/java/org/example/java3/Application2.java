package org.example.java3;

import java.util.Arrays;

// 배열을 사용하여 간단한 정렬 알고리즘 구현하기
public class Application2 {
    public static void main(String[] args) {
        int[] array = {9, 7, 5, 3, 1, 2, 4, 6, 8};
        System.out.println("정렬 전: " + Arrays.toString(array));
        selectionSort(array);
        System.out.println("정렬 후: " + Arrays.toString(array));
    }

    // 선택 정렬
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            swap(array, min, i);
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
