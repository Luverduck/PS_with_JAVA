package programmers.by_lv.lv00.p120860;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 직사각형 넓이 구하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120860
 */

class Solution {
    static public int solution(int[][] dots) {
        int maxX = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        for (int[] dot : dots) {
            maxX = Math.max(maxX, dot[0]);
            minX = Math.min(minX, dot[0]);
            maxY = Math.max(maxY, dot[1]);
            minY = Math.min(minY, dot[1]);
        }
        return (maxX - minX) * (maxY - minY);
    }

    static void main() {
        int res = solution(
                new int[][]{{-1, -1}, {1, 1}, {1, -1}, {-1, 1}}
        );
        System.out.println("res = " + res);
    }
}