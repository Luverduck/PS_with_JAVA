package programmers.by_lv.lv00.p181912;

import java.util.ArrayList;
import java.util.List;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 배열 만들기 5
 * https://school.programmers.co.kr/learn/courses/30/lessons/181912
 */

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> res = new ArrayList<>();
        for (String intStr : intStrs) {
            int part = Integer.parseInt(intStr.substring(s, s + l));
            if (part > k) res.add(part);
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}