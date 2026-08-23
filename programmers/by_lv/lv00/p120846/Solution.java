package programmers.by_lv.lv00.p120846;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 합성수 찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120846
 */

class Solution {
    static public int solution(int n) {
        int res = 0;
        for (int num = 2; num <= n; num++) {
            for (int i = 2; i * i <= num; ++i) {
                if (num % i == 0) {
                    res++;
                    break;
                }
            }
        }
        return res;
    }

    static void main() {
        int res = solution(10);
        System.out.println("res = " + res);
    }
}