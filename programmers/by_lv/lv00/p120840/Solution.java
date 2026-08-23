package programmers.by_lv.lv00.p120840;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 구슬을 나누는 경우의 수
 * https://school.programmers.co.kr/learn/courses/30/lessons/120840
 */

class Solution {
    static public int solution(int balls, int share) {
        int k = Math.min(share, balls - share);
        long res = 1;
        for (int i = 1; i <= k; ++i) {
            res = res * (balls - k + i) / i;
        }
        return (int) res;
    }

    static void main() {
        int res = solution(5, 5);
        System.out.println("res = " + res);
    }
}