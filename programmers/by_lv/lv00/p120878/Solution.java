package programmers.by_lv.lv00.p120878;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 유한소수 판별하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120878
 */

class Solution {
    public int solution(int a, int b) {
        int gcd = gcd(a, b);
        int n = b / gcd;
        while (n % 2 == 0) n /= 2;
        while (n % 5 == 0) n /= 5;
        return n == 1 ? 1 : 2;
    }

    int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }
}