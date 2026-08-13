package programmers.by_lv.lv00.p181930;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 주사위 게임 2
 * https://school.programmers.co.kr/learn/courses/30/lessons/181930
 */

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int res = a + b + c;
        if (a == b || b == c || c == a)
            res *= (a * a + b * b + c * c);
        if (a == b && b == c)
            res *= (a * a * a + b * b * b + c * c * c);
        answer = res;
        return answer;
    }
}