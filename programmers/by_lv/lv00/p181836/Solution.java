package programmers.by_lv.lv00.p181836;

import java.util.Arrays;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 그림 확대
 * https://school.programmers.co.kr/learn/courses/30/lessons/181836
 */

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] res = new String[picture.length * k];
        int idx = 0;
        for (int i = 0; i < picture.length; i++) {
            String s1 = picture[i];
            StringBuilder sb = new StringBuilder(s1.length() * k);
            for (int j = 0; j < s1.length(); j++) {
                sb.repeat(s1.charAt(j), k);
            }
            String s2 = sb.toString();
            Arrays.fill(res, idx, idx + k, s2);
            idx += k;
        }
        return res;
    }
}