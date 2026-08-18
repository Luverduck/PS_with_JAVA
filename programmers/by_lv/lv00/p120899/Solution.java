package programmers.by_lv.lv00.p120899;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 가장 큰 수 찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120899
 */

class Solution {
    public int[] solution(int[] array) {
        int idx = 0;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] > array[idx]) idx = i;
        }
        return new int[] {array[idx], idx};
    }
}