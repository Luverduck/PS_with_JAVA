package programmers.by_lv.lv00.p181856;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 배열 비교하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181856
 */

class Solution {
    static public int solution(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return arr1.length > arr2.length ? 1 : -1;
        else {
            int sum1 = 0, sum2 = 0;
            for (int i = 0; i < arr1.length; ++i) {
                sum1 += arr1[i];
                sum2 += arr2[i];
            }
            if (sum1 == sum2) return 0;
            else return sum1 > sum2 ? 1 : -1;
        }
    }

    /*static void main() {
        int res = solution(
                new int[]{1, 2, 3, 4, 5},
                new int[]{3, 3, 3, 3, 3}
        );
        System.out.print(res);
    }*/
}