package programmers.by_lv.lv00.p181829;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 이차원 배열 대각선 순회하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181829
 */

class Solution {
    public int solution(int[][] board, int k) {
        int res = 0;
        int rows = Math.min(board.length, k + 1);
        for (int i = 0; i < rows; ++i) {
            int cols = Math.min(board[0].length, k - i + 1);
            for (int j = 0; j < cols; ++j) {
                res += board[i][j];
            }
        }
        return res;
    }
}