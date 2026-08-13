package programmers.by_lv.lv00.p181918;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 배열 만들기 4
 * https://school.programmers.co.kr/learn/courses/30/lessons/181918
 */

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};

        Deque<Integer> dq = new ArrayDeque<>();
        int i = 0;
        while (i < arr.length) {
            if (dq.isEmpty()) dq.addLast(arr[i++]);
            else {
                if (dq.getLast() < arr[i]) dq.addLast(arr[i++]);
                else dq.removeLast();
            }
        }
        stk = dq.stream().mapToInt(Integer::intValue).toArray();
        return stk;
    }
}