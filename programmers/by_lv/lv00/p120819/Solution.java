package programmers.by_lv.lv00.p120819;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 아이스 아메리카노
 * https://school.programmers.co.kr/learn/courses/30/lessons/120819
 */

class Solution {
    public int[] solution(int money) {
        int[] res = new int[2];
        res[0] = money / 5500;
        res[1] = money % 5500;
        return res;
    }
}