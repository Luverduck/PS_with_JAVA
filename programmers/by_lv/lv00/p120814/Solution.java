package programmers.by_lv.lv00.p120814;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 피자 나눠 먹기 (1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/120814
 */

class Solution {
    public int solution(int n) {
        int i = 1;
        while (i * 7 < n) i++;
        return i;
    }
}