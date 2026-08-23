package programmers.by_lv.lv00.p120871;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 저주의 숫자 3
 * https://school.programmers.co.kr/learn/courses/30/lessons/120871
 */

class Solution {
    static public int solution(int n) {
        int number = 0;
        int count = 0;
        while (count < n) {
            number++;
            if (number % 3 == 0 || String.valueOf(number).contains("3")) continue;
            count++;
        }
        return number;
    }

    static void main() {
        int res = solution(15);
        System.out.println("res = " + res);
    }
}