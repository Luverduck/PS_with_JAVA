package programmers.by_lv.lv00.p181844;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 배열의 원소 삭제하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181844
 */

class Solution {
    static public int[] solution(int[] arr, int[] delete_list) {
        // 1 ~ 1000의 delete 여부 초기화
        boolean[] board = new boolean[1001];
        for (int n : delete_list) {
            board[n] = true;
        }
        // 결과 배열 크기 계산
        int length = 0;
        for (int n : arr) {
            if (!board[n]) length++;
        }
        // delete 처리 후 결과 배열 반환
        int[] res = new int[length];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!board[arr[i]]) {
                res[idx++] = arr[i];
            }
        }
        return res;
    }

    /*static void main() {
        int[] res = solution(
                new int[]{293, 1000, 395, 678, 94},
                new int[]{94, 777, 104, 1000, 1, 12}
        );
        for (int i : res) {
            System.out.print(i + " ");
        }
    }*/
}