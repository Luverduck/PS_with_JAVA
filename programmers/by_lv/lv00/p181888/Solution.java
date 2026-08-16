package programmers.by_lv.lv00.p181888;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * n개 간격의 원소들
 * https://school.programmers.co.kr/learn/courses/30/lessons/181888
 */

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] res = new int[(num_list.length + (n - 1)) / n];
        int idx = 0;
        for (int i = 0; i < num_list.length; i += n) {
            res[idx++] = num_list[i];
        }
        return res;
    }
}