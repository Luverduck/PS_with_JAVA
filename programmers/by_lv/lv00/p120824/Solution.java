package programmers.by_lv.lv00.p120824;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 짝수 홀수 개수
 * https://school.programmers.co.kr/learn/courses/30/lessons/120824
 */

class Solution {
    public int[] solution(int[] num_list) {
        int[] res = new int[2];
        for (int i = 0; i < num_list.length; ++i) {
            if (num_list[i] % 2 == 0) res[0]++;
        }
        res[1] = num_list.length - res[0];
        return res;
    }
}