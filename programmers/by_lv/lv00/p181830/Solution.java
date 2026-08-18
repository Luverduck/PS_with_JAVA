package programmers.by_lv.lv00.p181830;

import java.util.Arrays;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 정사각형으로 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181830
 */

class Solution {
    public int[][] solution(int[][] arr) {
        int rowLength = arr.length;
        int colLength = arr[0].length;
        if (rowLength == colLength) return arr;
        int maxLength = Math.max(rowLength, colLength);
        int[][] res = new int[maxLength][maxLength];
        for (int i = 0; i < rowLength; ++i) {
            res[i] = Arrays.copyOf(arr[i], maxLength);
        }
        return res;
    }
}