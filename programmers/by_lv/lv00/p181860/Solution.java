package programmers.by_lv.lv00.p181860;

import java.util.Arrays;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 빈 배열에 추가, 삭제하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181860
 */

class Solution {
    // 최종 길이와 처리 중 발생할 수 있는 최대 길이를 함께 계산
    static public int[] solution(int[] arr, boolean[] flag) {
        int length = 0;
        int maxLength = 0;
        for (int i = 0; i < arr.length; ++i) {
            length += (flag[i] ? 2 * arr[i] : -arr[i]);
            maxLength = Math.max(length, maxLength);
        }

        int[] res = new int[maxLength];
        int start = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (flag[i]) {
                int end = start + 2 * arr[i];
                Arrays.fill(res, start, end, arr[i]);
                start = end;
            } else {
                start -= arr[i];
            }
        }
        return Arrays.copyOfRange(res, 0, length);
    }

    /*static void main() {
        int[] res = solution(
                new int[]{3, 2, 4, 1, 3},
                new boolean[]{true, false, true, false, false}
        );
        for (int i : res) {
            System.out.print(i + ", ");
        }
    }*/
}