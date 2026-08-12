package programmers.by_lv.lv00.p181936;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 공배수
 * https://school.programmers.co.kr/learn/courses/30/lessons/181936
 */

class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        answer = (number % n == 0 && number % m == 0 ? 1 : 0);
        return answer;
    }
}