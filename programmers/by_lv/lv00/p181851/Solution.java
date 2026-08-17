package programmers.by_lv.lv00.p181851;

import java.util.PriorityQueue;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 전국 대회 선발 고사
 * https://school.programmers.co.kr/learn/courses/30/lessons/181851
 */

class Solution {
    /**
     * @param rank : 각 학생들의 선발 고사 등수를 담은 정수 배열
     * @param attendance : 각 학생들의 전국 대회 참여 가능 여부
     */
    public int solution(int[] rank, boolean[] attendance) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((numA, numB) -> Integer.compare(rank[numA], rank[numB]));
        for (int i = 0; i < rank.length; ++i) {
            if (attendance[i]) {
                pq.add(i);
            }
        }
        int a = pq.poll();
        int b = pq.poll();
        int c = pq.poll();
        return 10000 * a + 100 * b + c;
    }
}