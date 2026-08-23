package programmers.by_lv.lv00.p120854;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 배열 원소의 길이
 * https://school.programmers.co.kr/learn/courses/30/lessons/120854
 */

class Solution {
    public int[] solution(String[] strlist) {
        int[] res = new int[strlist.length];
        int idx = 0;
        for (String s : strlist) {
            res[idx++] = s.length();
        }
        return res;
    }
}