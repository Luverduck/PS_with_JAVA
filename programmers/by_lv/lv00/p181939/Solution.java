package programmers.by_lv.lv00.p181939;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 더 크게 합치기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181939
 */

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String as = String.valueOf(a);
        String bs = String.valueOf(b);
        String asb = as + bs;
        String bsb = bs + as;
        answer = Math.max(Integer.parseInt(asb), Integer.parseInt(bsb));
        return answer;
    }
}