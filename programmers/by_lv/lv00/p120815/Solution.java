package programmers.by_lv.lv00.p120815;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 피자 나눠 먹기 (2)
 * https://school.programmers.co.kr/learn/courses/30/lessons/120815
 */

class Solution {
    public int solution(int n) {
        return n / gcd(n, 6);
    }
    int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }
}