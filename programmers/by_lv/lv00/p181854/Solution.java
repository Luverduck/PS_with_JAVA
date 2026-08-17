package programmers.by_lv.lv00.p181854;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 배열의 길이에 따라 다른 연산하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181854
 */

class Solution {
    public int[] solution(int[] arr, int n) {
        int length = arr.length;
        int start = arr.length % 2 == 0 ? 1 : 0;
        for (int i = start; i < length; i += 2) arr[i] += n;
        return arr;
    }
}