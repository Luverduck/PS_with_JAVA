package programmers.by_lv.lv00.p181935;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 홀짝에 따라 다른 값 반환하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181935
 */

class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n % 2 != 0) {
            // n % 2 != 0 >> n = 2m - 1 >> m = (n + 1) / 2
            // SIGMA 1_m [2 * k - 1] = m * m
            answer = (n + 1) * (n + 1) / 4;
        } else {
            // n % 2 == 0 >> n = 2m >> m = n / 2
            // SIGMA 1_m [2 * k]^2 = 4 * m * (m + 1) * (2 * m + 1) / 6
            answer = n * (n + 1) * (n + 2) / 6;
        }
        return answer;
    }
}