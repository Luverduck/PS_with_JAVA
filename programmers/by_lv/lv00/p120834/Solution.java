package programmers.by_lv.lv00.p120834;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 외계행성의 나이
 * https://school.programmers.co.kr/learn/courses/30/lessons/120834
 */

class Solution {
    public String solution(int age) {
        char[] arr = String.valueOf(age).toCharArray();
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = (char) ('a' + arr[i] - '0');
        }
        return new String(arr);
    }
}