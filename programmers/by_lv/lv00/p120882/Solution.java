package programmers.by_lv.lv00.p120882;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 등수 매기기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120882
 */

class Solution {
    static public int[] solution(int[][] score) {
        int n = score.length;
        // 영어와 수학 점수 합 배열
        int[] sums = new int[n];
        // 점수 합 별 개수 배열
        int[] count = new int[201];
        // 초기화
        for (int i = 0; i < n; ++i) {
            sums[i] = score[i][0] + score[i][1];
            count[sums[i]]++;
        }
        // 점수 합 별 등수 배열
        int[] rank = new int[201];
        // 현재 점수 합보다 높은 점수 합 개수의 누적 합
        int higher = 0;
        // 등수 배열 초기화
        for (int sum = 200; sum >= 0; --sum) {
            if (count[sum] > 0) {
                rank[sum] = higher + 1;
                higher += count[sum];
            }
        }
        // 점수 합 별 등수 배열을 통해 점수 합 배열을 등수 배열로 변환
        int[] res = new int[n];
        for (int i = 0; i < n; ++i) {
            res[i] = rank[sums[i]];
        }
        return res;
    }

    static void main() {
        int[] res = solution(new int[][] {
            {80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}
        });
        System.out.println();
    }
}