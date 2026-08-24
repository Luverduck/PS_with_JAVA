package programmers.by_lv.lv00.p120817;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 배열의 평균값
 * https://school.programmers.co.kr/learn/courses/30/lessons/120817
 */

class Solution {
    public double solution(int[] numbers) {
        int sum = 0;
        for (int number : numbers) sum += number;
        return 1.0 * sum / numbers.length;
    }
}