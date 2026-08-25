package programmers.by_lv.lv00.p120816;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 피자 나눠 먹기 (3)
 * https://school.programmers.co.kr/learn/courses/30/lessons/120816
 */

class Solution {
    public int solution(int slice, int n) {
        int sum = slice;
        while (sum < n) {
            sum += slice;
        }
        return sum / slice;
    }
}