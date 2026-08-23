package programmers.by_lv.lv00.p120852;

import java.util.Set;
import java.util.TreeSet;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 소인수분해
 * https://school.programmers.co.kr/learn/courses/30/lessons/120852
 */

class Solution {
    static public int[] solution(int n) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 2; i * i <= n; ++i) {
            if (n % i != 0) continue;
            set.add(i);
            while (n % i == 0) n /= i;
        }
        if (n != 1) set.add(n);
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    static void main() {
        int[] res = solution(10);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}