package programmers.by_lv.lv00.p181874;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * A 강조하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181874
 */

class Solution {
    public String solution(String myString) {
        myString = myString.toLowerCase();
        myString = myString.replace('a', 'A');
        return myString;
    }
}