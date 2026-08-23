package programmers.by_lv.lv00.p120850;

import java.util.ArrayList;
import java.util.List;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 문자열 정렬하기 (1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/120850
 */

class Solution {
    public int[] solution(String my_string) {
        char[] arr = my_string.toCharArray();
        List<Integer> list = new ArrayList<>();
        for (char c : arr) {
            if (Character.isDigit(c)) list.add(c - '0');
        }
        list.sort(null);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}