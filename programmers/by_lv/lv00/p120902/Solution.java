package programmers.by_lv.lv00.p120902;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 문자열 계산하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120902
 */

class Solution {
    static public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        int res = Integer.parseInt(arr[0]);
        for (int i = 2; i < arr.length; i += 2) {
            int cur = Integer.parseInt(arr[i]);
            res += (arr[i - 1].equals("+") ? cur : -cur);
        }
        return res;
    }

    /*static void main() {
        int res = solution("3 + 4");
        System.out.println(res);
    }*/
}