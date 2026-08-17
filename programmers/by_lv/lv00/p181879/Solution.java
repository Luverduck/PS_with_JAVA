package programmers.by_lv.lv00.p181879;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 길이에 따른 연산
 * https://school.programmers.co.kr/learn/courses/30/lessons/181879
 */

class Solution {
    static public int solution(int[] num_list) {
        int res = num_list.length < 11 ? 1 : 0;
        if (num_list.length >= 11) {
            for (int i : num_list) res += i;
        } else {
            for (int i : num_list) res *= i;
        }
        return res;
    }
    /*static void main() {
        int res = solution(new int[]{2, 3, 4, 5});
        System.out.println("res = " + res);
    }*/
}