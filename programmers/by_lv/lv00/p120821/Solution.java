package programmers.by_lv.lv00.p120821;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 배열 뒤집기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120821
 */

class Solution {
    public int[] solution(int[] num_list) {
        int s = 0;
        int e = num_list.length - 1;
        while (s < e) {
            int tmp = num_list[s];
            num_list[s] = num_list[e];
            num_list[e] = tmp;
            s++;
            e--;
        }
        return num_list;
    }
}