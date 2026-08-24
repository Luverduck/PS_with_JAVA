package programmers.by_lv.lv00.p120835;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 진료순서 정하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120835
 */

class Solution {
    static public int[] solution(int[] emergency) {
        int[] rank = new int[emergency.length];
        for (int i = 0; i < emergency.length; ++i) {
            for (int j = 0; j < emergency.length; ++j) {
                if (emergency[i] <= emergency[j]) rank[i]++;
            }
        }
        return rank;
    }

    static void main() {
        int[] res = solution(
                new int[]{3, 76, 24}
        );
        for (int i : res) {
            System.out.println(i + " ");
        }
    }
}