package programmers.by_lv.lv00.p181875;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 배열에서 문자열 대소문자 변환하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181875
 */

class Solution {
    public String[] solution(String[] strArr) {
        String[] res = new String[strArr.length];
        for (int i = 0; i < strArr.length; ++i) {
            if (i % 2 != 0) res[i] = strArr[i].toUpperCase();
            else res[i] = strArr[i].toLowerCase();
        }
        return res;
    }
}