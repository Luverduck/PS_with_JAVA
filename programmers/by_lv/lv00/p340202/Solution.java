package programmers.by_lv.lv00.p340202;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * [PCCE 기출문제] 6번 / 물 부족
 * https://school.programmers.co.kr/learn/courses/30/lessons/340202
 */

class Solution {
    static public int solution(int storage, int usage, int[] change) {
        int total_usage = 0;
        for (int i = 0; i < change.length; i++) {
            usage = usage * (100 + change[i]) / 100;
            total_usage += usage;
            if (total_usage > storage) {
                return i;
            }
        }
        return -1;
    }

    static void main() {
        //int res = solution(5141, 500, new int[]{10, -10, 10, -10, 10, -10, 10, -10, 10, -10});
        int res = solution(1000, 2000, new int[]{-10, 25, -33});
        System.out.println(res);
    }
}