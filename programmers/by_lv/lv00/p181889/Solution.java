package programmers.by_lv.lv00.p181889;

import java.util.Arrays;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * n 번째 원소까지
 * https://school.programmers.co.kr/learn/courses/30/lessons/181889
 */

class Solution {
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, 0, n);
    }
}