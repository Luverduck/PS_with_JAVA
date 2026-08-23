package programmers.by_lv.lv00.p120842;

import java.util.Arrays;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 2차원으로 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120842
 */

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int length = num_list.length / n;
        int[][] res = new int[length][];
        for (int i = 0; i < res.length; ++i) {
            res[i] = Arrays.copyOfRange(num_list, i * n, (i + 1) * n);
        }
        return res;
    }
}