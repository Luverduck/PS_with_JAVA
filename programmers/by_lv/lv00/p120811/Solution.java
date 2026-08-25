package programmers.by_lv.lv00.p120811;

import java.util.Arrays;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 중앙값 구하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120811
 */

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }
}