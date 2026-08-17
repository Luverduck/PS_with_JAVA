package programmers.by_lv.lv00.p181866;

import java.util.Arrays;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * x 사이의 개수
 * https://school.programmers.co.kr/learn/courses/30/lessons/181866
 */

class Solution {
    static public String[] solution(String myString) {
        // String.split()은 문자열을 정규표현식 기반으로 분리했을 때 맨 앞 빈 문자열("")을 자동으로 제거해주지 않음
        // >> 직접 제거해야 함
        String[] arr = myString.split("x+");
        Arrays.sort(arr);
        return !arr[0].isEmpty() ? arr : Arrays.copyOfRange(arr, 1, arr.length);
    }
    /*static void main() {
        String[] res = solution("xxxabcxxdefx");
        for (String s : res) {
            System.out.print(s + " ");
        }
    }*/
}