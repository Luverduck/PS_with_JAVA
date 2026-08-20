package programmers.by_lv.lv00.p120888;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 중복된 문자 제거
 * https://school.programmers.co.kr/learn/courses/30/lessons/120888
 */

class Solution {
    public String solution(String my_string) {
        boolean[] board = new boolean[128];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); ++i) {
            char c = my_string.charAt(i);
            if (!board[c]) {
                sb.append(c);
                board[c] = true;
            }
        }
        return sb.toString();
    }
    /*public String solution2(String my_string) {
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); ++i) {
            if (set.add(my_string.charAt(i))) sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }*/
}