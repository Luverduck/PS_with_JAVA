package programmers.by_lv.lv00.p120911;

import java.util.Arrays;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 문자열 정렬하기 (2)
 * https://school.programmers.co.kr/learn/courses/30/lessons/120911
 */

class Solution {
    public String solution(String my_string) {
        char[] arr = my_string.toCharArray();
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = Character.toLowerCase(arr[i]);
        }
        Arrays.sort(arr);
        return new String(arr);
    }
}