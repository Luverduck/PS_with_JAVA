package programmers.by_lv.lv00.p120851;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 숨어있는 숫자의 덧셈 (1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/120851
 */

class Solution {
    public int solution(String my_string) {
        char[] arr = my_string.toCharArray();
        int res = 0;
        for (char c : arr) {
            if (Character.isDigit(c)) res += c - '0';
        }
        return res;
    }
}