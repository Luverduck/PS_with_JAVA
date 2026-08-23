package programmers.by_lv.lv00.p120880;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 특이한 정렬
 * https://school.programmers.co.kr/learn/courses/30/lessons/120880
 */

class Solution {
    static public int[] solution(int[] numlist, int n) {
        List<Integer> list = Arrays.stream(numlist).boxed().collect(Collectors.toList());
        list.sort((a, b) -> {
            int flag = Integer.compare(Math.abs(a - n), Math.abs(b - n));
            return flag != 0 ? flag : Integer.compare(b, a);
        });
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    static void main() {
        int[] res = solution(
                new int[]{1, 2, 3, 4, 5, 6}, 4
        );
        for (int i : res) {
            System.out.println(i + " ");
        }
    }
}