package programmers.by_lv.lv00.p120844;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 배열 회전시키기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120844
 */

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] res = new int[numbers.length];
        if (direction.equals("left")) {
            System.arraycopy(numbers, 1, res, 0, numbers.length - 1);
            res[res.length - 1] = numbers[0];
        } else {
            System.arraycopy(numbers, 0, res, 1, numbers.length - 1);
            res[0] = numbers[numbers.length - 1];
        }
        return res;
    }
}