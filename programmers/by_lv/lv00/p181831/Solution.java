package programmers.by_lv.lv00.p181831;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 특별한 이차원 배열 2
 * https://school.programmers.co.kr/learn/courses/30/lessons/181831
 */

class Solution {
    static public int solution(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (arr[i][j] != arr[j][i]) return 0;
            }
        }
        return 1;
    }
    /*static void main() {
        int res = solution(
                new int[][]{
                        {19, 498, 258, 587},
                        {63, 93, 7, 754},
                        {258, 7, 1000, 723},
                        {587, 754, 723, 81}
                }
        );
    }*/
}