package programmers.by_lv.lv00.p181897;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 리스트 자르기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181897
 */

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int s = (n == 1 ? 0 : slicer[0]);
        int e = (n == 2 ? num_list.length - 1 : slicer[1]);
        int d = (n == 4 ? slicer[2] : 1);
        int[] answer = new int[(e - s + d) / d];
        int idx = 0;
        for (int i = s; i <= e; i += d) {
            answer[idx++] = num_list[i];
        }
        return answer;
    }
}