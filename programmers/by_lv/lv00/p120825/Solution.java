package programmers.by_lv.lv00.p120825;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 문자 반복 출력하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120825
 */

class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); ++i) {
            sb.repeat(my_string.charAt(i), n);
        }
        return sb.toString();
    }
}