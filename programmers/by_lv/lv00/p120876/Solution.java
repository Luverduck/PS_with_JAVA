package programmers.by_lv.lv00.p120876;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 겹치는 선분의 길이
 * https://school.programmers.co.kr/learn/courses/30/lessons/120876
 */

class Solution {
    static public int solution(int[][] lines) {
        int[] board = new int[201];
        for (int[] line : lines) {
            board[line[0] + 100]++;
            board[line[1] + 100]--;
        }
        int res = 0;
        int cur = 0;
        for (int i = 0; i < board.length; ++i) {
            cur += board[i];
            if (cur >= 2) res++;
        }
        return res;
    }
}