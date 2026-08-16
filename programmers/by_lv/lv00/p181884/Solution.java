package programmers.by_lv.lv00.p181884;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * n보다 커질 때까지 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181884
 */

class Solution {
    public int solution(int[] numbers, int n) {
        int res = 0;
        for (int number : numbers) {
            if (res > n) break;
            res += number;
        }
        return res;
    }
}