package programmers.by_lv.lv00.p181842;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 부분 문자열
 * https://school.programmers.co.kr/learn/courses/30/lessons/181842
 */

class Solution {
    public int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }
}