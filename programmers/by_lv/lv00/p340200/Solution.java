package programmers.by_lv.lv00.p340200;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * [PCCE 기출문제] 8번 / 닉네임 규칙
 * https://school.programmers.co.kr/learn/courses/30/lessons/340200
 */

class Solution {
    public String solution(String nickname) {
        String answer = "";
        for (int i = 0; i < nickname.length(); i++) {
            if (nickname.charAt(i) == 'l') {
                answer += "I";
            } else if (nickname.charAt(i) == 'w') {
                answer += "vv";
            } else if (nickname.charAt(i) == 'W') {
                answer += "VV";
            } else if (nickname.charAt(i) == 'O') {
                answer += "0";
            } else {
                answer += nickname.charAt(i);
            }
        }
        if (answer.length() < 3) {
            answer += "o".repeat(4 - answer.length());
        }
        if (answer.length() > 8) {
            answer = answer.substring(0, 8);
        }
        return answer;
    }
}
