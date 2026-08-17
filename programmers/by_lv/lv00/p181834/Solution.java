package programmers.by_lv.lv00.p181834;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * l로 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181834
 */

class Solution {
    public String solution(String myString) {
        char[] res = myString.toCharArray();
        for (int i = 0; i < res.length; i++) {
            if (res[i] < 'l') res[i] = 'l';
        }
        return new String(res);
    }
}