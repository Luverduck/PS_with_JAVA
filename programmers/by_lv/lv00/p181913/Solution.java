package programmers.by_lv.lv00.p181913;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 문자열 여러 번 뒤집기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181913
 */

class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();
        for (int[] q : queries) {
            int s = q[0];
            int e = q[1];
            // 임시 부분 문자열을 만들지 않고 char 배열에서 직접 뒤집는다.
            while (s < e) {
                char tmp = arr[s];
                arr[s] = arr[e];
                arr[e] = tmp;
                s++;
                e--;
            }
        }
        return new String(arr);
    }
}