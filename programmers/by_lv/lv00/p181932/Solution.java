package programmers.by_lv.lv00.p181932;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 코드 처리하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181932
 */

class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < code.length(); ++i) {
            char c = code.charAt(i);
            if (c != '1') {
                if (mode == 0 && (i % 2 == 0)) sb.append(c);
                else if (mode == 1 && (i % 2 != 0)) sb.append(c);
            }
            if (c == '1') mode ^= 1;
        }
        String ret = sb.toString();
        answer = (ret.isEmpty() ? "EMPTY" : ret);
        return answer;
    }
}