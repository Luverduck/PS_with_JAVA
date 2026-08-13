package programmers.by_lv.lv00.p181920;

import java.util.ArrayList;
import java.util.List;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 카운트 업
 * https://school.programmers.co.kr/learn/courses/30/lessons/181920
 */

class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        List<Integer> res = new ArrayList<>();
        while (start_num <= end_num) {
            res.add(start_num);
            start_num++;
        }
        answer = res.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}