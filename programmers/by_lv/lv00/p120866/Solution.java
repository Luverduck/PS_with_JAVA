package programmers.by_lv.lv00.p120866;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 안전지대
 * https://school.programmers.co.kr/learn/courses/30/lessons/120866
 */

class Solution {

    static int[][] result = new int[101][101];
    static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};

    public int solution(int[][] board) {
        int danger = 0;
        int n = board.length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (board[i][j] != 1) continue;
                if (result[i][j] == 0) {
                    result[i][j] = 1;
                    danger++;
                }
                for (int dir = 0; dir < 8; ++dir) {
                    int nx = i + dx[dir];
                    int ny = j + dy[dir];
                    if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                    if (result[nx][ny] == 0) {
                        result[nx][ny] = 1;
                        danger++;
                    }
                }
            }
        }
        return n * n - danger;
    }
}