package programmers.by_lv.lv00.p120892;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 암호 해독
 * https://school.programmers.co.kr/learn/courses/30/lessons/120892
 */

class Solution {
    static public String solution(String cipher, int code) {
        char[] arr = new char[cipher.length() / code];
        int idx = 0;
        for (int i = code - 1; i < cipher.length(); i += code) {
            arr[idx++] = cipher.charAt(i);
        }
        return new String(arr);
    }
    /*static void main() {
        String res = solution("dfjardstddetckdaccccdegk", 4);
        System.out.println(res);
    }*/
}