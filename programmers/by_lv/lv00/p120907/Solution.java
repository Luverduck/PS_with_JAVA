package programmers.by_lv.lv00.p120907;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * OX퀴즈
 * https://school.programmers.co.kr/learn/courses/30/lessons/120907
 */

class Solution {
    public String[] solution(String[] quiz) {
        String[] arr = new String[quiz.length];
        int idx = 0;
        for (String exp : quiz) {
            String[] s = exp.split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[2]);
            int c = Integer.parseInt(s[4]);
            boolean res = (s[1].equals("+") ? a + b == c : a - b == c);
            arr[idx++] = (res ? "O" : "X");
        }
        return arr;
    }
}