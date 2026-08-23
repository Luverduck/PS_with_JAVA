package programmers.by_lv.lv00.p120841;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 점의 위치 구하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120841
 */

class Solution {
    public int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];
        if (x > 0 && y > 0) return 1;
        else if (x < 0 && y > 0) return 2;
        else if (x < 0 && y < 0) return 3;
        else return 4;
    }
}