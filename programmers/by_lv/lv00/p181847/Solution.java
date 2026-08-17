package programmers.by_lv.lv00.p181847;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 0 떼기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181847
 */

class Solution {
    static public String solution(String n_str) {
        int idx = 0;
        while (n_str.charAt(idx) == '0') {
            idx++;
        }
        return n_str.substring(idx);
    }
}