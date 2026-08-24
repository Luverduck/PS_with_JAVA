package programmers.by_lv.lv00.p120833;

import java.util.Arrays;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 배열 자르기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120833
 */

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}