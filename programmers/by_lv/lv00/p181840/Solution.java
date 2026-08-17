package programmers.by_lv.lv00.p181840;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 정수 찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181840
 */

class Solution {
    static public int solution(int[] num_list, int n) {
        for (int num : num_list) {
            if (num == n) return 1;
        }
        return 0;
    }
}