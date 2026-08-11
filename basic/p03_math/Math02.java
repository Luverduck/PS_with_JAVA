package basic.p03_math;

import java.util.Arrays;

public class Math02 {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6 };

        // 배열 요소의 합
        int sum = Arrays.stream(arr).sum();
        System.out.println("sum = " + sum);

        // 배열 요소의 평균
        double average = Arrays.stream(arr).average().orElse(0);
        System.out.println("average = " + average);

    }
}
