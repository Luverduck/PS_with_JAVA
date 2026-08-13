package programmers.by_lv.lv00.p181919;

import java.util.ArrayList;
import java.util.List;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 콜라츠 수열 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181919
 */

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> res = new ArrayList<>();
        res.add(n);
        while (n > 1) {
            if (n % 2 == 0) n /= 2;
            else n = (3 * n + 1);
            res.add(n);
        }
        answer = res.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}