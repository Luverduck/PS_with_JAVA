package programmers.by_lv.lv00.p181867;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * x 사이의 개수
 * https://school.programmers.co.kr/learn/courses/30/lessons/181867
 */

class Solution {
    static public int[] solution(String myString) {
        // String.split(String reg, int limit)
        // - limit = 0 : 문자열을 정규표현식 기반으로 분리했을 때 마지막 빈 문자열("") 제거 (기본값)
        // - limit = 1 : 문자열을 정규표현식 기반으로 분리했을 때 마지막 빈 문자열("") 유지 (기본값)
        String[] arr = myString.split("x", -1);
        int[] res = new int[arr.length];
        int idx = 0;
        for (String s : arr) {
            res[idx++] = s.length();
        }
        return res;
    }

    /*static void main() {
        int[] res = solution("oxooxoxxox");
        for (int i : res) {
            System.out.print(i + " ");
        }
    }*/
}