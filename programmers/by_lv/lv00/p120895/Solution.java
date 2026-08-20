package programmers.by_lv.lv00.p120895;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 인덱스 바꾸기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120895
 */

class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] arr = my_string.toCharArray();
        char tmp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = tmp;
        return new String(arr);
    }
}