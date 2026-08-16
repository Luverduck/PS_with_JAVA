package programmers.by_lv.lv00.p181891;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 순서 바꾸기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181891
 */

class Solution {
    static public int[] solution(int[] num_list, int n) {
        int length = num_list.length;
        int[] res = new int[length];
        System.arraycopy(num_list, 0, res, length - n, n);
        System.arraycopy(num_list, n, res, 0, length - n);
        return res;
    }
}