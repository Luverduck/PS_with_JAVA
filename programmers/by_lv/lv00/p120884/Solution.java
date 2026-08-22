package programmers.by_lv.lv00.p120884;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 치킨 쿠폰
 * https://school.programmers.co.kr/learn/courses/30/lessons/120884
 */

class Solution {
    static public int solution(int chicken) {
        return chicken == 0 ? 0 : (chicken - 1) / 9;
    }

    /**
     * @param chicken :지금까지 받은 서비스 치킨 누적 수
     * @param coupon : 현재 가진 쿠폰 수
     * @return
     */
    static public int recur(int chicken, int coupon) {
        if (coupon < 10) return chicken;
        return recur(chicken + coupon / 10, coupon / 10 + coupon % 10);
    }

    static public int solution1(int chicken) {
        return recur(0, chicken);
    }
}