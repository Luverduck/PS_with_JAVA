package programmers.by_lv.lv00.p181893;

import java.util.Arrays;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 배열 조각하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181893
 */

class Solution {
    static public int[] solution(int[] arr, int[] query) {
        int s = 0;
        int e = arr.length - 1;
        for (int i = 0; i < query.length; ++i) {
            if (i % 2 == 0) e = s + query[i];
            else s += query[i];
        }
        return Arrays.copyOfRange(arr, s, e + 1);
    }

    /*static void main() {
        int[] res = solution(
                new int[]{0, 1, 2, 3, 4, 5},
                new int[]{4, 1, 2}
        );
        for (int i : res) {
            System.out.print(i + " ");
        }
    }*/
}