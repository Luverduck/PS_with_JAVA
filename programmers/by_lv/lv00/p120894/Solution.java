package programmers.by_lv.lv00.p120894;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 영어가 싫어요
 * https://school.programmers.co.kr/learn/courses/30/lessons/120894
 */

class Solution {
    static String[] NUMBERS = {
        "zero", "one", "two", "three", "four",
        "five", "six", "seven", "eight", "nine"
    };
    static public long solution(String numbers) {
        long res = 0;
        int idx = 0;
        while (idx < numbers.length()) {
            for (int i = 0; i < NUMBERS.length; i++) {
                String num = NUMBERS[i];
                if (numbers.startsWith(num, idx)) {
                    res = (10 * res) + i;
                    idx += num.length();
                    break;
                }
            }
        }
        return res;
    }
    static void main() {
        long res = solution("onetwothreefourfivesixseveneightnine");
        System.out.println(res);
    }
}