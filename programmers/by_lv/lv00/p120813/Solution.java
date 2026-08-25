package programmers.by_lv.lv00.p120813;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 짝수는 싫어요
 * https://school.programmers.co.kr/learn/courses/30/lessons/120813
 */

class Solution {
    public int[] solution(int n) {
        int[] res = new int[(n + 1) / 2];
        for (int i = 0; i < res.length; ++i) {
            res[i] = 2 * i + 1;
        }
        return res;
    }
}