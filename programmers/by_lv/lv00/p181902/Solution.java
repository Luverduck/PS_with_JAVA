package programmers.by_lv.lv00.p181902;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 문자 개수 세기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181902
 */

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] arr = my_string.toCharArray();
        for (char c : arr) {
            answer[c - (c < 'a' ? 'A' : 'a' - 26)]++;
        }
        return answer;
    }
}