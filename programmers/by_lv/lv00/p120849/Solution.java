package programmers.by_lv.lv00.p120849;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 모음 제거
 * https://school.programmers.co.kr/learn/courses/30/lessons/120849
 */

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); ++i) {
            char c = my_string.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') continue;
            sb.append(c);
        }
        return sb.toString();
    }
}