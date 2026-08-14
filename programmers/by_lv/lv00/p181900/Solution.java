package programmers.by_lv.lv00.p181900;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 글자 지우기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181900
 */

class Solution {
    static public String solution(String my_string, int[] indices) {
        String[] arr = my_string.split("");
        for (int i = 0; i < indices.length; ++i) {
            arr[indices[i]] = "";
        }
        return String.join("", arr);
    }

    /*static void main() {
        System.out.println(solution("apporoograpemmemprs", new int[] {1, 16, 6, 15, 0, 10, 11, 3}));
    }*/
}