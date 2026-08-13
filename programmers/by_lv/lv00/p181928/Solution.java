package programmers.by_lv.lv00.p181928;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 이어 붙인 수
 * https://school.programmers.co.kr/learn/courses/30/lessons/181928
 */

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        for (int num : num_list) {
            (num % 2 != 0 ? odd : even).append(num);
        }
        answer = Integer.parseInt(odd.toString()) + Integer.parseInt(even.toString());
        return answer;
    }
}