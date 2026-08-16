package programmers.by_lv.lv00.p181894;

import java.util.Arrays;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 2의 영역
 * https://school.programmers.co.kr/learn/courses/30/lessons/181894
 */

class Solution {
    static public int[] solution(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s < arr.length && arr[s] != 2) {
            s++;
        }
        if (s == arr.length) return new int[] { -1 };
        while (e > s && arr[e] != 2) {
            e--;
        }
        return Arrays.copyOfRange(arr, s, e + 1);
    }
}