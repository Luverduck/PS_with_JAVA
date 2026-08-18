package programmers.by_lv.lv00.p120913;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 잘라서 배열로 저장하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120913
 */

class Solution {
    public String[] solution(String my_str, int n) {
        int length = (my_str.length() + n - 1) / n;
        String[] res = new String[length];
        for (int i = 0; i < length; ++i) {
            int s = n * i;
            res[i] = my_str.substring(s, Math.min(s + n, my_str.length()));
        }
        return res;
    }
}