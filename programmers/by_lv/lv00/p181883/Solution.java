package programmers.by_lv.lv00.p181883;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 수열과 구간 쿼리 1
 * https://school.programmers.co.kr/learn/courses/30/lessons/181883
 */

class Solution {
    static public int[] solution(int[] arr, int[][] queries) {
        int[] diff = new int[arr.length + 1];
        for (int[] query : queries) {
            diff[query[0]]++;
            diff[query[1] + 1]--;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += diff[i];
            arr[i] += sum;
        }
        return arr;
    }

    /*static void main() {
        int[] res = solution(
                new int[]{0, 1, 2, 3, 4},
                new int[][]{{0, 1}, {1, 2}, {2, 3}}
        );
        for (int i : res) {
            System.out.print(i + " ");
        }
    }*/
}