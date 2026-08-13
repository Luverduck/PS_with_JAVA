package programmers.by_lv.lv00.p181931;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 등차수열의 특정한 항만 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181931
 */

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int res = 0;
        int nd = 0;
        for (boolean b : included) {
            if (b) res += (a + nd);
            nd += d;
        }
        answer = res;
        return answer;
    }
}