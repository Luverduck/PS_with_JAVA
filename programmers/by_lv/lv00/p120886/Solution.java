package programmers.by_lv.lv00.p120886;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * A로 B 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120886
 */

class Solution {
    public int solution(String before, String after) {
        int[] board = new int['z' - 'a' + 1];
        for (int i = 0; i < before.length(); ++i) {
            board[before.charAt(i) - 'a']++;
            board[after.charAt(i) - 'a']--;
        }
        for (int i = 0; i < board.length; ++i) {
            if (board[i] != 0) return 0;
        }
        return 1;
    }
}