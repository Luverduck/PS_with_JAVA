package basic.p04_arrays;

import java.util.*;

public class Arrays01 {
    public static void main(String[] args) {

        int[] arr = { 6, 3, 2, 4, 5, 1 };

        // 배열 오름차순 정렬
        int[] arrSortAsc = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrSortAsc);
        System.out.println(Arrays.toString(arrSortAsc));

        // 배열 내림차순 정렬
        Integer[] arrSortDesc = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arrSortDesc, Collections.reverseOrder());
        System.out.println(Arrays.toString(arrSortDesc));

        // 배열 범위 정렬
        int[] arrSortRange = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrSortRange, 0, 4);
        System.out.println(Arrays.toString(arrSortRange));

        // 이진 탐색을 통해 배열의 특정 요소를 찾아 인덱스 반환
        int[] arrBinarySearch = Arrays.copyOf(arr, arr.length);
        int findIdx = Arrays.binarySearch(arrBinarySearch, 4);

        // 배열 얕은 복사
        int[] arrCopyOf = Arrays.copyOf(arr, arr.length + 1);
        System.out.println(Arrays.toString(arr) + " " + Arrays.toString(arrCopyOf));

        // 배열 부분 얕은 복사
        int[] arrCopyOfRange = Arrays.copyOfRange(arr, 0, 3);

        // 배열의 모든 요소를 특정 값으로 초기화
        int[] arrFill = Arrays.copyOf(arr, arr.length);
        Arrays.fill(arrFill, -1);

        // 배열의 동등 여부 반환
        int[] arrEquals1 = Arrays.copyOf(arr, arr.length);
        int[] arrEquals2 = Arrays.copyOf(arr, arr.length);
        boolean isEqual = Arrays.equals(arrEquals1, arrEquals2);

        // 배열의 요소를 문자열로 변환
        int[] arrToString = Arrays.copyOf(arr, arr.length);
        String arrString = Arrays.toString(arrToString);

        // 배열을 고정 길이의 List로 변환
        int[] arrAsList = Arrays.copyOf(arr, arr.length);
        Integer[] arrAsListBoxed = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        List<Integer> arrList = Arrays.asList(arrAsListBoxed);

        // 배열의 중복 요소 제거
        int[] arrDuplicated = { 1, 1, 1, 1, 4, 5, 6 };
        int[] arrDistinct = Arrays.stream(arrDuplicated).distinct().toArray();

    }
}
