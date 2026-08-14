package programmers.by_lv.lv00.p181901;

import java.util.ArrayList;
import java.util.List;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 배열 만들기 1
 * https://school.programmers.co.kr/learn/courses/30/lessons/181901
 */

class Solution {
    public int[] solution(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = k; i <= n; i += k) {
            list.add(i);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}