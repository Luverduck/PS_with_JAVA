package programmers.by_lv.lv00.p120862;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 최댓값 만들기 (2)
 * https://school.programmers.co.kr/learn/courses/30/lessons/120862
 */

class Solution {
    static public int solution(int[] numbers) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number > max1) {
                max2 = max1;
                max1 = number;
            } else if (number > max2) {
                max2 = number;
            }

            if (number < min1) {
                min2 = min1;
                min1 = number;
            } else if (number < min2) {
                min2 = number;
            }
        }
        return Math.max(max1 * max2, min1 * min2);
    }

    static public int solution1(int[] numbers) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; ++i) {
            for (int j = i + 1; j < numbers.length; ++j) {
                res = Math.max(res, numbers[i] * numbers[j]);
            }
        }
        return res;
    }

    static void main() {
        int res = solution(
                new int[]{1, 2, -3, 4, -5}
        );
        System.out.println("res = " + res);
    }
}