package programmers.by_lv.lv00.p181909;

import java.util.Arrays;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 접미사 배열
 * https://school.programmers.co.kr/learn/courses/30/lessons/181909
 */

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); ++i) {
            answer[i] = my_string.substring(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}