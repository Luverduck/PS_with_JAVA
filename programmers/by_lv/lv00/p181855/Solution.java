package programmers.by_lv.lv00.p181855;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 문자열 묶기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181855
 */

class Solution {
    public int solution(String[] strArr) {
        int[] counts = new int[31];
        int max = 0;
        for (String s : strArr) {
            int idx = s.length();
            counts[idx]++;
            max = Math.max(max, counts[idx]);
        }
        return max;
    }

    /*static void main() {
        int res = solution(
                new int[]{1, 2, 3, 4, 5},
                new int[]{3, 3, 3, 3, 3}
        );
        System.out.print(res);
    }*/
}