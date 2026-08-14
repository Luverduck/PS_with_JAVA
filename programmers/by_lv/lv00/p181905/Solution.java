package programmers.by_lv.lv00.p181905;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 문자열 뒤집기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181905
 */

class Solution {
    public String solution(String my_string, int s, int e) {
        char[] arr = my_string.toCharArray();
        while (s < e) {
            char tmp = arr[s];
            arr[s] = arr[e];
            arr[e] = tmp;
            s++;
            e--;
        }
        return new String(arr);
    }
}