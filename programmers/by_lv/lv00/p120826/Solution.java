package programmers.by_lv.lv00.p120826;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 특정 문자 제거하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120826
 */

class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder();
        char x = letter.charAt(0);
        for (int i = 0; i < my_string.length(); ++i) {
            char c = my_string.charAt(i);
            if (c == x) continue;
            sb.append(c);
        }
        return sb.toString();
    }
}