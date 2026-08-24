package programmers.by_lv.lv00.p120837;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 개미 군단
 * https://school.programmers.co.kr/learn/courses/30/lessons/120837
 */

class Solution {
    static int[] ant = new int[] {5, 3, 1};
    static public int solution(int hp) {
        int res = 0;
        for (int i : ant) {
            res += hp / i;
            hp %= i;
        }
        return res;
    }

    static void main() {
        int res = solution(999);
        System.out.println("res = " + res);
    }
}