package programmers.by_lv.lv00.p181923;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 수열과 구간 쿼리 2
 * https://school.programmers.co.kr/learn/courses/30/lessons/181923
 */

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        answer = new int[queries.length];
        int idx = 0;
        for (int[] q : queries) {
            int s = q[0];
            int e = q[1];
            int k = q[2];
            int min = Integer.MAX_VALUE;
            for (int i = s; i <= e; ++i) {
                if (arr[i] > k) min = Math.min(arr[i], min);
            }
            answer[idx++] = (min != Integer.MAX_VALUE ? min : -1);
        }
        return answer;
    }
}