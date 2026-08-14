package programmers.by_lv.lv00.p181895;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 배열 만들기 3
 * https://school.programmers.co.kr/learn/courses/30/lessons/181895
 */

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int a1 = intervals[0][0];
        int b1 = intervals[0][1];
        int a2 = intervals[1][0];
        int b2 = intervals[1][1];
        int length1 = b1 - a1 + 1;
        int length2 = b2 - a2 + 1;
        int[] res = new int[length1 + length2];
        // System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
        // - src : 원본 배열
        // - srcPos : 원본 배열 복사 시작 위치
        // - dest : 목적 배열
        // - destPos : 목적 배열 복사 시작 위치
        // - length : 복사 길이 (원본 배열 복사 시작 위치부터 복사 길이만큼 복사)
        System.arraycopy(arr, a1, res, 0, length1);
        System.arraycopy(arr, a2, res, length1, length2);
        return res;
    }
}