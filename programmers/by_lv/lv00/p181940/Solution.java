package programmers.by_lv.lv00.p181940;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 문자열 곱하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181940
 */

class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        sb.repeat(my_string, k);
        answer = sb.toString();
        return answer;
    }
}