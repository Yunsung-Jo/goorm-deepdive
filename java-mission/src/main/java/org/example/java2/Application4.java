package org.example.java2;

import java.util.Arrays;

// (Java) 5개의 정수 오름차순 정렬하기
public class Application4 {
    public static void main(String[] args) {
        int[] array = initArray();

        System.out.println("정렬 전: " + Arrays.toString(array));

        selectionSort(array);
        System.out.println("선택 정렬: " + Arrays.toString(array));
        array = initArray();

        bubbleSort(array);
        System.out.println("버블 정렬: " + Arrays.toString(array));
        array = initArray();

        insertionSort(array);
        System.out.println("삽입 정렬: " + Arrays.toString(array));
    }

    // 선택 정렬
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            // 가장 작은 값 찾기
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            // i번째 값과 교환
            swap(array, min, i);
        }
    }

    // 버블 정렬
    public static void bubbleSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                // 현재 값이 다음 값보다 큰 경우 교환
                // 버블 정렬은 뒤에서부터 한 개씩 정렬된다.
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    // 삽입 정렬
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && temp < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int[] initArray() {
        return new int[]{99, 1, 10, 50, 30};
    }
}
