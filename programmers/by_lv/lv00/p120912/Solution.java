package programmers.by_lv.lv00.p120912;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 7의 개수
 * https://school.programmers.co.kr/learn/courses/30/lessons/120912
 */

class Solution {
    static public int solution(int[] array) {
        int res = 0;
        for (int n : array) {
            while (n > 0) {
                if (n % 10 == 7) res++;
                n /= 10;
            }
        }
        return res;
    }
}