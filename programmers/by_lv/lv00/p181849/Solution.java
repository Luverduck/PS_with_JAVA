package programmers.by_lv.lv00.p181849;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 문자열 정수의 합
 * https://school.programmers.co.kr/learn/courses/30/lessons/181849
 */

class Solution {
    public int solution(String num_str) {
        int res = 0;
        for (int i = 0; i < num_str.length(); i++) {
            res += num_str.charAt(i) - '0';
        }
        return res;
    }
}