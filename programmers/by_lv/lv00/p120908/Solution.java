package programmers.by_lv.lv00.p120908;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 문자열안에 문자열
 * https://school.programmers.co.kr/learn/courses/30/lessons/120908
 */

class Solution {
    public int solution(String str1, String str2) {
        return str1.contains(str2)? 1 : 2;
    }
}