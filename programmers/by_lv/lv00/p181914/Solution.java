package programmers.by_lv.lv00.p181914;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 9로 나눈 나머지
 * https://school.programmers.co.kr/learn/courses/30/lessons/181914
 */

class Solution {
    public int solution(String number) {
        int answer = 0;
        int s = 0;
        for (int i = 0; i < number.length(); ++i) {
            s += (number.charAt(i) - '0');
        }
        answer = (s != 0 ? s % 9 : 0);
        return answer;
    }
}