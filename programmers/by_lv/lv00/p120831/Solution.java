package programmers.by_lv.lv00.p120831;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 짝수의 합
 * https://school.programmers.co.kr/learn/courses/30/lessons/120831
 */

class Solution {
    public int solution(int n) {
        int k = n / 2;
        return k * (k + 1);
    }
}