package programmers.by_lv.lv00.p120903;

import java.util.*;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 배열의 유사도
 * https://school.programmers.co.kr/learn/courses/30/lessons/120903
 */

class Solution {
    public int solution(String[] s1, String[] s2) {
        Set<String> set = new HashSet<>(Arrays.asList(s1));
        int res = 0;
        for (int i = 0; i < s2.length; ++i) {
            if (set.contains(s2[i])) res++;
        }
        return res;
    }
}