package programmers.by_lv.lv00.p181864;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 문자열 바꿔서 찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181864
 */

class Solution {
    public int solution(String myString, String pat) {
        char[] arr = myString.toCharArray();
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = (arr[i] == 'A' ? 'B' : 'A');
        }
        return new String(arr).contains(pat) ? 1 : 0;
    }
}