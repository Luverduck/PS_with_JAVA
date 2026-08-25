package programmers.by_lv.lv00.p120812;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 최빈값 구하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120812
 */

class Solution {
    static int[] count = new int[1001];
    public int solution(int[] array) {
        int maxCount = Integer.MIN_VALUE;
        for (int i : array) {
            count[i]++;
            maxCount = Math.max(maxCount, count[i]);
        }
        int res = -1;
        for (int i = 0; i < count.length; ++i) {
            if (count[i] == maxCount) {
                if (res != -1) return -1;
                res = i;
            }
        }
        return res;
    }
}