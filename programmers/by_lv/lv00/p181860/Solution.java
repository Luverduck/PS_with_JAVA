package programmers.by_lv.lv00.p181860;

import java.util.Arrays;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 배열 만들기 6
 * https://school.programmers.co.kr/learn/courses/30/lessons/181859
 */

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = new int[arr.length];
        int top = 0;
        for (int i = 0; i < arr.length; ++i) {
            // 배열에 원소가 있으며 stk의 마지막 원소가 arr[i]와 같을 경우
            if (top > 0 && stk[top - 1] == arr[i]) top--;
            // 빈 배열 || 배열에 원소가 있으며 stk의 마지막 원소가 arr[i]와 다를 경우
            else stk[top++] = arr[i];
        }
        return top == 0 ? new int[] { -1 } : Arrays.copyOfRange(stk, 0, top);
    }
    /*public int[] solution1(int[] arr) {
        int i = 0;
        Deque<Integer> dq = new ArrayDeque<>();
        while (i < arr.length) {
            if (dq.isEmpty()) {
                dq.addLast(arr[i]);
            } else if (dq.getLast() == arr[i]) {
                dq.removeLast();
            } else if (dq.getLast() != arr[i]) {
                dq.addLast(arr[i]);
            }
            i++;
        }
        return dq.isEmpty() ? new int[] { -1 } : dq.stream().mapToInt(Integer::intValue).toArray();
    }*/
}