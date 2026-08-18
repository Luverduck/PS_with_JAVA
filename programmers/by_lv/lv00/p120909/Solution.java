package programmers.by_lv.lv00.p120909;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 제곱수 판별하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120909
 */

class Solution {
    static public int solution(int n) {
        int r = (int) Math.sqrt(n);
        return r * r == n ? 1 : 2;
    }

    /*static void main() {
        solution(976);
    }*/
}