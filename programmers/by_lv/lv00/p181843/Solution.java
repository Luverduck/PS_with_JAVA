package programmers.by_lv.lv00.p181843;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 부분 문자열인지 확인하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181843
 */

class Solution {
    public int solution(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }
}