package programmers.by_lv.lv00.p181899;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 카운트 다운
 * https://school.programmers.co.kr/learn/courses/30/lessons/181899
 */

class Solution {
    static public int[] solution(int start_num, int end_num) {
        int[] arr = new int[start_num - end_num + 1];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = start_num--;
        }
        return arr;
    }
}