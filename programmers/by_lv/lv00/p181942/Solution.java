package programmers.by_lv.lv00.p181942;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 문자열 섞기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181942
 */

class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length(); ++i) {
            sb.append(str1.charAt(i));
            sb.append(str2.charAt(i));
        }
        answer = sb.toString();
        return answer;
    }
}