package programmers.by_lv.lv00.p120906;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 자릿수 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120906
 */

class Solution {
    public int solution(int n) {
        int res = 0;
        while (n > 0) {
            res += n % 10;
            n /= 10;
        }
        return res;
    }
}