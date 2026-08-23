package programmers.by_lv.lv00.p120875;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 평행
 * https://school.programmers.co.kr/learn/courses/30/lessons/120875
 */

class Solution {
    // 선분 a-b와 선분 c-d가 평행한지 여부
    static public boolean parallel(int[] a, int[] b, int[] c, int[] d) {
        int dx1 = a[0] - b[0];
        int dy1 = a[1] - b[1];
        int dx2 = c[0] - d[0];
        int dy2 = c[1] - d[1];
        return dx1 * dy2 == dx2 * dy1;
    }

    static public int solution(int[][] dots) {
        if (parallel(dots[0], dots[1], dots[2], dots[3])) return 1;
        if (parallel(dots[0], dots[2], dots[1], dots[3])) return 1;
        if (parallel(dots[0], dots[3], dots[1], dots[2])) return 1;
        return 0;
    }

    /*static void main() {
        int res = solution(
                new int[][] {{1, 4}, {9, 2}, {3, 8}, {11, 6}}
        );
        System.out.println("res = " + res);
    }*/
}