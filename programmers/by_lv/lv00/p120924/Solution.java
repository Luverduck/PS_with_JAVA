package programmers.by_lv.lv00.p120924;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 다음에 올 숫자
 * https://school.programmers.co.kr/learn/courses/30/lessons/120924
 */

class Solution {
    public int solution(int[] common) {
        int a = common[0];
        int b = common[1];
        int c = common[2];
        if (c + a == 2 * b) {
            return common[common.length - 1] + (b - a);
        }
        else {
            return common[common.length - 1] * (b / a);
        }
    }
}