package programmers.by_lv.lv00.p181833;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 특별한 이차원 배열 1
 * https://school.programmers.co.kr/learn/courses/30/lessons/181833
 */

class Solution {
    public int[][] solution(int n) {
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            res[i][i] = 1;
        }
        return res;
    }
}