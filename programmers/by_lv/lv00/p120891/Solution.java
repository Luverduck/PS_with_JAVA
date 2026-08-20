package programmers.by_lv.lv00.p120891;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 369게임
 * https://school.programmers.co.kr/learn/courses/30/lessons/120891
 */

class Solution {
    public int solution(int order) {
        int res = 0;
        while (order > 0) {
            int n = order % 10;
            if (n == 3 || n == 6 || n == 9) res++;
            order /= 10;
        }
        return res;
    }
}