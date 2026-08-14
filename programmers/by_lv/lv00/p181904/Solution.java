package programmers.by_lv.lv00.p181904;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 세로 읽기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181904
 */

class Solution {
    static public String solution(String my_string, int m, int c) {
        char[] arr = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = c - 1; i < arr.length; i += m) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }

    /*static void main() {
        System.out.println(solution("programmers", 1, 1));
    }*/
}