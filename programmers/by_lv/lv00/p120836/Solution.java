package programmers.by_lv.lv00.p120836;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 순서쌍의 개수
 * https://school.programmers.co.kr/learn/courses/30/lessons/120836
 */

class Solution {
    static public int solution(int n) {
        int res = 0;
        for (int i = 1; i * i <= n; ++i) {
            if (n % i == 0) {
                res++;
                if (n / i != i) res++;
            }
        }
        return res;
    }

    static void main() {
        int res = solution(4);
        System.out.println("res = " + res);
    }
}