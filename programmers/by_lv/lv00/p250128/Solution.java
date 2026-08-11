package programmers.by_lv.lv00.p250128;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * [PCCE 기출문제] 6번 / 가채점
 * https://school.programmers.co.kr/learn/courses/30/lessons/250128
 */

class Solution {
    /**
     * @param numbers : 성적을 문의하려는 학생들의 번호가 담긴 정수 리스트
     * @param our_score : 성적을 문의하려는 학생 순서대로 가채점한 점수가 담긴 정수 리스트
     * @param score_list : 실제 성적이 번호 순서대로 담긴 정수 리스트
     */
    public String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i] - 1]) {
                answer[i] = "Same";
            }
            else {
                answer[i] = "Different";
            }
        }

        return answer;
    }
}