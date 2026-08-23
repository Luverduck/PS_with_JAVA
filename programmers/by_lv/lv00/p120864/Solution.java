package programmers.by_lv.lv00.p120864;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 숨어있는 숫자의 덧셈 (2)
 * https://school.programmers.co.kr/learn/courses/30/lessons/120864
 */

class Solution {
    static public int solution(String my_string) {
        int sum = 0;
        int num = 0;
        for (int i = 0; i < my_string.length(); ++i) {
            char c = my_string.charAt(i);
            if (c >= '0' && c <= '9')
                num = num * 10 + (c - '0');
            else {
                sum += num;
                num = 0;
            }
        }
        return sum + num;
    }

    static void main() {
        int res = solution("12");
        System.out.println("res = " + res);
    }
}