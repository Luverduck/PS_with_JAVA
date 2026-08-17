package programmers.by_lv.lv00.p181835;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 조건에 맞게 수열 변환하기 3
 * https://school.programmers.co.kr/learn/courses/30/lessons/181835
 */

class Solution {
    public int[] solution(int[] arr, int k) {
        if (k % 2 != 0) {
            for (int i = 0; i < arr.length; i++) arr[i] *= k;
        } else {
            for (int i = 0; i < arr.length; i++) arr[i] += k;
        }
        return arr;
    }
}