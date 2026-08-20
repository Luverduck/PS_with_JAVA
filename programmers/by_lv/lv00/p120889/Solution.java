package programmers.by_lv.lv00.p120889;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 삼각형의 완성조건 (1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/120889
 */

class Solution {
    public int solution(int[] sides) {
        int a = sides[0];
        int b = sides[1];
        int c = sides[2];
        int maxSide = Math.max(a, Math.max(b, c));
        return 2 * maxSide - (a + b + c) < 0 ? 1 : 2;
    }
}
/*
    c가 가장 큰 값이라 할 때
    c < a + b
    c - (a + b) < 0
    2 * c - (a + b + c) < 0
*/