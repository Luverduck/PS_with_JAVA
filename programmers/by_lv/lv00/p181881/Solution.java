package programmers.by_lv.lv00.p181881;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 조건에 맞게 수열 변환하기 2
 * https://school.programmers.co.kr/learn/courses/30/lessons/181881
 */

class Solution {
    static public int solution(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            boolean flag = true;
            while (flag) {
                cnt++;
                if (arr[i] >= 50 && arr[i] % 2 == 0) arr[i] /= 2;
                else if (arr[i] < 50 && arr[i] % 2 != 0) arr[i] = 2 * arr[i] + 1;
                else flag = false;
            }
            max = Math.max(cnt, max);
        }
        return max - 1;
    }

    /*static void main() {
        int res = solution(new int[] {1, 2, 3, 100, 99, 98});
        System.out.println(res);
    }*/
}