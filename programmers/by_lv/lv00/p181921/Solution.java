package programmers.by_lv.lv00.p181921;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 배열 만들기 2
 * https://school.programmers.co.kr/learn/courses/30/lessons/181921
 */

class Solution {
    // 이진수 방식
    public int[] solution1(int l, int r) {
        List<Integer> res = new ArrayList<>();
        // 000000 ~ 111111
        for (int i = 1; i < 64; ++i) {
            // Integer.toBinaryString(i) : 정수 i를 이진수 형태의 문자열로 변환
            String binaryString = Integer.toBinaryString(i);
            int num = Integer.parseInt(binaryString) * 5;
            if (num >= l && num <= r) res.add(num);
        }
        return res.isEmpty() ? new int[] {-1} : res.stream().mapToInt(Integer::intValue).toArray();
    }
    // BFS 방식
    public int[] solution2(int l, int r) {
        List<Integer> res = new ArrayList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(5);
        while (!q.isEmpty()) {
            int cur = q.poll();
            if (cur >= l && cur <= r) res.add(cur);
            int nxtZero = cur * 10;
            int nxtFive = nxtZero + 5;
            if (nxtZero <= r) q.add(nxtZero);
            if (nxtFive <= r) q.add(nxtFive);
        }
        return res.isEmpty() ? new int[] {-1} : res.stream().mapToInt(Integer::intValue).toArray();
    }
}