package programmers.by_lv.lv00.p120839;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 가위 바위 보
 * https://school.programmers.co.kr/learn/courses/30/lessons/120839
 */

class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rsp.length(); ++i) {
            char c = rsp.charAt(i);
            switch (c) {
                case '2': sb.append(0); break;
                case '0': sb.append(5); break;
                case '5': sb.append(2); break;
            }
        }
        return sb.toString();
    }
}