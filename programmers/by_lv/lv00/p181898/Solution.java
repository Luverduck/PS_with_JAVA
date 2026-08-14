package programmers.by_lv.lv00.p181898;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 가까운 1 찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181898
 */

class Solution {
    public int solution(int[] arr, int idx) {
        for (int i = idx; i < arr.length; ++i) {
            if (arr[i] != 1) continue;
            return i;
        }
        return -1;
    }
}