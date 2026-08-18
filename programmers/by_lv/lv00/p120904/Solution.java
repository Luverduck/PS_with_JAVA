package programmers.by_lv.lv00.p120904;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 숫자 찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120904
 */

class Solution {
    public int solution(int num, int k) {
        int idx = String.valueOf(num).indexOf('0' + k);
        return idx != -1 ? idx + 1 : -1;
    }
}