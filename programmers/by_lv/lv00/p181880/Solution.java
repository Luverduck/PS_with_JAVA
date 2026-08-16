package programmers.by_lv.lv00.p181880;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 1로 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181880
 */

class Solution {
    static public int solution(int[] num_list) {
        int res = 0;
        for (int n : num_list) {
            int cnt = Integer.toBinaryString(n).length() - 1;
            res += cnt;
        }
        return res;
    }
    /*static void main() {
        int res = solution(new int[] {12, 4, 15, 1, 14});
        System.out.println(res);
    }*/
}