package programmers.by_lv.lv00.p120808;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 분수의 덧셈
 * https://school.programmers.co.kr/learn/courses/30/lessons/120808
 */

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int x = numer1 * denom2 + numer2 * denom1;
        int y = denom1 * denom2;
        int gcd = gcd(x, y);
        return new int[] {x / gcd, y / gcd};
    }
    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}