package programmers.by_lv.lv00.p181938;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 두 수의 연산값 비교하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181938
 */

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String as = String.valueOf(a);
        String bs = String.valueOf(b);
        int res1 = Integer.parseInt(as + bs);
        int res2 = 2 * a * b;
        answer = res1 != res2 ? Math.max(res1, res2) : res1;
        return answer;
    }
}