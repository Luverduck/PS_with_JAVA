package programmers.by_lv.lv00.p120809;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 배열 두 배 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120809
 */

class Solution {
    public int[] solution(int[] numbers) {
        int[] res = new int[numbers.length];
        for (int i = 0; i < res.length; ++i) res[i] = 2 * numbers[i];
        return res;
    }
}