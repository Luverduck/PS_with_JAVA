package programmers.by_lv.lv00.p120921;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 문자열 밀기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120921
 */

class Solution {
    static public int solution(String A, String B) {
        return (B + B).indexOf(A);
    }

    /*static void main() {
        int res = solution("abc", "abc");
        System.out.println(res);
    }*/
}