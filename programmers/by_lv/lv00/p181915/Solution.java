package programmers.by_lv.lv00.p181915;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 글자 이어 붙여 문자열 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181915
 */

class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < index_list.length; ++i) {
            sb.append(my_string.charAt(index_list[i]));
        }
        answer = sb.toString();
        return answer;
    }
}