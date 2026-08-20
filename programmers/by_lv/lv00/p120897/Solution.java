package programmers.by_lv.lv00.p120897;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 약수 구하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120897
 */

class Solution {
    static public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= n; ++i) {
            if (n % i != 0) continue;
            list.add(i);
            if (n / i != i)
                list.add(n / i);
        }
        Collections.sort(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    static void main() {
        int[] res = solution(4);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}