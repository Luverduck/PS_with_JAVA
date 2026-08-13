package programmers.by_lv.lv00.p181927;

import java.util.Arrays;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 마지막 두 원소
 * https://school.programmers.co.kr/learn/courses/30/lessons/181927
 */

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int length = num_list.length;
        int[] temp = Arrays.copyOf(num_list, length + 1);
        int lastFirst = num_list[length - 1];
        int lastSecond = num_list[length - 2];
        temp[length] = lastFirst > lastSecond ? (lastFirst - lastSecond) : 2 * lastFirst;
        answer = temp;
        return answer;
    }
}