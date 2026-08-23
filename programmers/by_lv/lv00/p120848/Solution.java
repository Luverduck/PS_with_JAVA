package programmers.by_lv.lv00.p120848;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 팩토리얼
 * https://school.programmers.co.kr/learn/courses/30/lessons/120848
 */

class Solution {
    static public int solution(int n) {
        int i = 1;
        int factorial = 1;
        while (factorial * (i + 1) <= n) {
            factorial *= ++i;
        }
        return i;
    }

    static void main() {
        int res = solution(3628800);
        System.out.println("res = " + res);
    }
}