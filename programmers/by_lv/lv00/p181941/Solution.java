package programmers.by_lv.lv00.p181941;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 문자 리스트를 문자열로 변환하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181941
 */

class Solution {
    public String solution(String[] arr) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (String s : arr) sb.append(s);
        answer = sb.toString();
        return answer;
    }
}