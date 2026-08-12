package programmers.by_lv.lv00.p181937;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * n의 배수
 * https://school.programmers.co.kr/learn/courses/30/lessons/181937
 */

class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        answer = (num % n == 0 ? 1 : 0);
        return answer;
    }
}