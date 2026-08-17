package programmers.by_lv.lv00.p181857;

import java.util.Arrays;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 배열의 길이를 2의 거듭제곱으로 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181857
 */

class Solution {
    static public int[] solution(int[] arr) {
        int length = 1;
        while (length < arr.length) {
            length <<= 1;
        }
        return Arrays.copyOf(arr, length);
    }

    /*static void main() {
        int[] res = solution(new int[]{1, 2, 3, 4, 5, 6});
        for (int i : res) {
            System.out.print(i + " ");
        }
    }*/
}