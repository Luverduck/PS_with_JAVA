package programmers.by_lv.lv00.p120830;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 양꼬치
 * https://school.programmers.co.kr/learn/courses/30/lessons/120830
 */

class Solution {
    public int solution(int n, int k) {
        k -= (n / 10);
        return 12000 * n + 2000 * k;
    }
}