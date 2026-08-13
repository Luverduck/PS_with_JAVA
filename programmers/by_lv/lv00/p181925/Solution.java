package programmers.by_lv.lv00.p181925;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 수 조작하기 2
 * https://school.programmers.co.kr/learn/courses/30/lessons/181925
 */

class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < numLog.length; ++i) {
            int d = numLog[i] - numLog[i - 1];
            switch (d) {
                case 1: sb.append('w'); break;
                case -1: sb.append('s'); break;
                case 10: sb.append('d'); break;
                case -10: sb.append('a'); break;
            }
        }
        answer = sb.toString();
        return answer;
    }
}