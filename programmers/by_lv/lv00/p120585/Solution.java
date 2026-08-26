package programmers.by_lv.lv00.p120585;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 머쓱이보다 키 큰 사람
 * https://school.programmers.co.kr/learn/courses/30/lessons/120585
 */

class Solution {
    public int solution(int[] array, int height) {
        int res = 0;
        for (int i : array) {
            if (i > height) res++;
        }
        return res;
    }
}