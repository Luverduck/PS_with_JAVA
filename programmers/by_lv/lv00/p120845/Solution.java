package programmers.by_lv.lv00.p120845;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 주사위의 개수
 * https://school.programmers.co.kr/learn/courses/30/lessons/120845
 */

class Solution {
    public int solution(int[] box, int n) {
        return (box[0] / n) * (box[1] / n) * (box[2] / n);
    }
}