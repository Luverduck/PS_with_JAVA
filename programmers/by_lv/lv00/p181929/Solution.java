package programmers.by_lv.lv00.p181929;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 원소들의 곱과 합
 * https://school.programmers.co.kr/learn/courses/30/lessons/181929
 */

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int m = 1;
        int s = 0;
        for (int i : num_list) {
            m *= i;
            s += i;
        }
        answer = m < s * s ? 1 : 0;
        return answer;
    }
}