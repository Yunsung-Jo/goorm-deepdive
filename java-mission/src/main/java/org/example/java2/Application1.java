package org.example.java2;

import java.util.Arrays;

// (Java) 배열의 평균을 계산하고 배열 요소를 변경하는 메서드 작성하기
public class Application1 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 10};

        float avg = arrayAvgCalc(array);
        System.out.println("배열의 평균: " + avg);

        System.out.println("\n요소 변경 전: " + Arrays.toString(array));
        arrayChange(array);
        System.out.println("요소 변경 후: " + Arrays.toString(array));
    }

    public static float arrayAvgCalc(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        float avg = (float) sum / array.length;
        return avg;
    }

    public static void arrayChange(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += array[i];
        }
    }
}
