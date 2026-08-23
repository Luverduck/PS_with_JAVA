package programmers.by_lv.lv00.p120843;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 공 던지기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120843
 */

class Solution {
    static public int solution(int[] numbers, int k) {
        int idx = 2 * (k - 1) % numbers.length;
        return numbers[idx];
    }

    static void main() {
        int res = solution(new int[]{1, 2, 3, 4}, 2);
        System.out.println("res = " + res);
    }
}