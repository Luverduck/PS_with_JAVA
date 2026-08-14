package programmers.by_lv.lv00.p181903;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * qr code
 * https://school.programmers.co.kr/learn/courses/30/lessons/181903
 */

class Solution {
    public String solution(int q, int r, String code) {
        char[] arr = code.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = r; i < arr.length; i += q) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}