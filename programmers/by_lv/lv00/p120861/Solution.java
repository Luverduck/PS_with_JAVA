package programmers.by_lv.lv00.p120861;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 캐릭터의 좌표
 * https://school.programmers.co.kr/learn/courses/30/lessons/120861
 */

class Solution {
    static public int[] solution(String[] keyinput, int[] board) {
        int[] pos = {0, 0};
        for (String input : keyinput) {
            switch (input) {
                case "up":
                    pos[1] = Math.min(pos[1] + 1, board[1] / 2);
                    break;
                case "down":
                    pos[1] = Math.max(pos[1] - 1, -board[1] / 2);
                    break;
                case "right":
                    pos[0] = Math.min(pos[0] + 1, board[0] / 2);
                    break;
                case "left":
                    pos[0] = Math.max(pos[0] - 1, -board[0] / 2);
                    break;
            }
        }
        return pos;
    }

    static void main() {
        solution(
                new String[] {"left", "right", "up", "right", "right"},
                new int[] {11, 11}
        );
    }
}