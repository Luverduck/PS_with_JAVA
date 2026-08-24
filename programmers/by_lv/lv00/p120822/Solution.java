package programmers.by_lv.lv00.p120822;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 뒤집힌 문자열
 * https://school.programmers.co.kr/learn/courses/30/lessons/120822
 */

class Solution {
    public String solution(String my_string) {
        char[] arr = my_string.toCharArray();
        int s = 0;
        int e = arr.length - 1;
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