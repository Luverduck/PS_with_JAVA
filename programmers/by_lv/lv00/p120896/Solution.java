package programmers.by_lv.lv00.p120896;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 한 번만 등장한 문자
 * https://school.programmers.co.kr/learn/courses/30/lessons/120896
 */

class Solution {
    public String solution(String s) {
        int[] board = new int['z' - 'a' + 1];
        for (int i = 0; i < s.length(); i++) {
            board[s.charAt(i) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < board.length; i++) {
            if (board[i] == 1) sb.append((char) (i + 'a'));
        }
        return sb.toString();
    }
}