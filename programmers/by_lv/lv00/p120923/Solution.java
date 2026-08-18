package programmers.by_lv.lv00.p120923;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 연속된 수의 합
 * https://school.programmers.co.kr/learn/courses/30/lessons/120923
 */

class Solution {
    public int[] solution(int num, int total) {
        int a = (2 * total - num * (num - 1)) / num / 2;
        int[] res = new int[num];
        for (int i = 0; i < num; ++i) {
            res[i] = a + i;
        }
        return res;
    }
}