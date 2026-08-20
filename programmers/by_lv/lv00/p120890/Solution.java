package programmers.by_lv.lv00.p120890;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 가까운 수
 * https://school.programmers.co.kr/learn/courses/30/lessons/120890
 */

class Solution {
    static public int solution(int[] array, int n) {
        int res = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;
        for (int number : array) {
            int diff = Math.abs(number - n);
            if (diff < minDiff || (diff == minDiff && number < res)) {
                minDiff = diff;
                res = number;
            }
        }
        return res;
    }
    /*static void main() {
        int res = solution(new int[]{11, 11, 13}, 12);
        System.out.println("res = " + res);
    }*/
}