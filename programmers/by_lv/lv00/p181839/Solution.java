package programmers.by_lv.lv00.p181839;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 주사위 게임 1
 * https://school.programmers.co.kr/learn/courses/30/lessons/181839
 */

class Solution {
    public int solution(int a, int b) {
        boolean aIsOdd = a % 2 == 1;
        boolean bIsOdd = b % 2 == 1;
        if (aIsOdd && bIsOdd) return (a * a + b * b);
        else if (!aIsOdd && !bIsOdd) return Math.abs(a - b);
        else return 2 * (a + b);
    }
}