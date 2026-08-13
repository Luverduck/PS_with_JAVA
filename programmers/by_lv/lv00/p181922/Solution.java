package programmers.by_lv.lv00.p181922;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 수열과 구간 쿼리 4
 * https://school.programmers.co.kr/learn/courses/30/lessons/181922
 */

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for (int[] q : queries) {
            int s = q[0];
            int e = q[1];
            int k = q[2];
            for (int i = s; i <= e; ++i) {
                if (i == 0 || i % k == 0) arr[i]++;
            }
        }
        answer = arr;
        return answer;
    }
}