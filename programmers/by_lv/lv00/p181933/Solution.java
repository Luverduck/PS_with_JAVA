package programmers.by_lv.lv00.p181933;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * flag에 따라 다른 값 반환하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181934
 */

class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        answer = (flag ? a + b : a - b);
        return answer;
    }
}