package programmers.by_lv.lv00.p120868;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 삼각형의 완성조건 (2)
 * https://school.programmers.co.kr/learn/courses/30/lessons/120868
 */

class Solution {
    public int solution(int[] sides) {
        int a = sides[0];
        int b = sides[1];
        int l = Math.max(a, b);
        int s = Math.min(a, b);
        // a, b 중에 하나가 가장 긴 변일 경우 l < s + c 이므로 c > l - s
        // c가 가장 긴 변일 경우 c < l + s 이므로 c < l + s
        // 최종적으로 c의 범위는 l - s < c < l + s
        return 2 * s - 1;
    }
}