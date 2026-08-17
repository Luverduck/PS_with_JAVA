package programmers.by_lv.lv00.p181852;

import java.util.Arrays;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 뒤에서 5등 위로
 * https://school.programmers.co.kr/learn/courses/30/lessons/181852
 */

class Solution {
    static public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 5, num_list.length);
    }

    /*static void main() {
        int[] res = solution(new int[]{12, 4, 15, 46, 38, 1, 14});
        for (int i : res) {
            System.out.print(i + " ");
        }
    }*/
}