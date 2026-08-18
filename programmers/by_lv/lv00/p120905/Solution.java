package programmers.by_lv.lv00.p120905;

import java.util.Arrays;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * n의 배수 고르기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120905
 */

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] res = new int[numlist.length];
        int idx = 0;
        for (int num : numlist) {
            if (num % n == 0) res[idx++] = num;
        }
        return Arrays.copyOfRange(res, 0, idx);
    }
}