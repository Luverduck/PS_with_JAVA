package programmers.by_lv.lv00.p181862;

import java.util.Arrays;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 세 개의 구분자
 * https://school.programmers.co.kr/learn/courses/30/lessons/181862
 */

class Solution {
    static public String[] solution(String myStr) {
        String[] arr = myStr.split("[abc]+");
        if (arr.length == 0) return new String[] {"EMPTY"};
        if (arr[0].isEmpty()) return Arrays.copyOfRange(arr, 1, arr.length);
        return arr;
    }

    /*static void main() {
        String[] res = solution("abcd");
        for (String s : res) {
            System.out.print(s + " / ");
        }
    }*/
}