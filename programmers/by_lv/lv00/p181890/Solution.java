package programmers.by_lv.lv00.p181890;

import java.util.Arrays;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 왼쪽 오른쪽
 * https://school.programmers.co.kr/learn/courses/30/lessons/181890
 */

class Solution {
    public String[] solution(String[] str_list) {
        for (int i = 0; i < str_list.length; i++) {
            String s = str_list[i];
            if (s.equals("l")) {
                return Arrays.copyOfRange(str_list, 0, i);
            } else if (s.equals("r")) {
                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }
        return new String[0];
    }
}