package programmers.by_lv.lv00.p120893;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 대문자와 소문자
 * https://school.programmers.co.kr/learn/courses/30/lessons/120893
 */

class Solution {
    public String solution(String my_string) {
        char[] arr = my_string.toCharArray();
        for (int i = 0; i < arr.length; ++i) {
            if (Character.isUpperCase(arr[i])) arr[i] = Character.toLowerCase(arr[i]);
            else arr[i] = Character.toUpperCase(arr[i]);
        }
        return new String(arr);
    }
}