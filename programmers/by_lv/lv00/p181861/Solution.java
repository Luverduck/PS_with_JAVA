package programmers.by_lv.lv00.p181861;

import java.util.Arrays;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 배열의 원소만큼 추가하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181861
 */

class Solution {
    static public int[] solution(int[] arr) {
        int length = 0;
        for (int n : arr) length += n;
        int[] res = new int[length];
        int idx = 0;
        for (int n : arr) {
            // Arrays.fill(T[] a, int fromIndex, int toIndex, int val)
            Arrays.fill(res, idx, idx + n, n);
            idx += n;
        }
        return res;
    }
    /*static void main() {
        solution(new int[] {5, 1, 4});
    }*/
}