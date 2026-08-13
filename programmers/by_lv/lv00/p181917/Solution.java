package programmers.by_lv.lv00.p181917;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 간단한 논리 연산
 * https://school.programmers.co.kr/learn/courses/30/lessons/181917
 */

class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        answer = (x1 || x2) && (x3 || x4);
        return answer;
    }
}