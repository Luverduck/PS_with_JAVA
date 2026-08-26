package programmers.by_lv.lv00.p120583;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 중복된 숫자 개수
 * https://school.programmers.co.kr/learn/courses/30/lessons/120583
 */

class Solution {
    public int solution(int[] array, int n) {
        int res = 0;
        for (int i : array) if (i == n) res++;
        return res;
    }
}