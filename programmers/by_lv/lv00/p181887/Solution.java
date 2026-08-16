package programmers.by_lv.lv00.p181887;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 홀수 vs 짝수
 * https://school.programmers.co.kr/learn/courses/30/lessons/181887
 */

class Solution {
    public int solution(int[] num_list) {
        int even = 0, odd = 0;
        for (int i = 1; i <= num_list.length; i++) {
            if (i % 2 == 0) even += num_list[i - 1];
            else odd += num_list[i - 1];
        }
        return Math.max(even, odd);
    }
}