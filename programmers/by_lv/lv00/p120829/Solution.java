package programmers.by_lv.lv00.p120829;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 각도기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120829
 */

class Solution {
    public int solution(int angle) {
        if (angle < 90) return 1;
        else if (angle == 90) return 2;
        else if (angle < 180) return 3;
        else return 4;
    }
}