package programmers.by_lv.lv00.p181858;

import java.util.*;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 무작위로 K개의 수 뽑기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181858
 */

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] res = new int[k];
        Arrays.fill(res, -1);
        int idx = 0;
        Set<Integer> s = new HashSet<>();
        for (int n : arr) {
            // Set의 add(E e)는 새로운 값이 추가된 경우 true, 그렇지 않을 경우 false 반환
            if (s.add(n)) {
                res[idx++] = n;
                if (idx == k) break;
            }
        }
        return res;
    }
}