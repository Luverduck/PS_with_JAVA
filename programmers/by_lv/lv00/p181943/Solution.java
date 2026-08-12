package programmers.by_lv.lv00.p181943;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 문자열 겹쳐쓰기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181943
 */

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
        // replace(int start, int end, String s)
        sb = sb.replace(s, s + overwrite_string.length(), overwrite_string);
        answer = sb.toString();
        return answer;
    }
}