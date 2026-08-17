package programmers.by_lv.lv00.p181838;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 날짜 비교하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181838
 */

class Solution {
    public int solution(int[] date1, int[] date2) {
        for (int i = 0; i < date1.length; i++) {
            // 1. 두 값이 같으면 다음 위치로 넘어감
            // 2. 처음으로 다른 값이 나오면 그 값으로 대소 관계를 결정
            if (date1[i] < date2[i]) return 1;
            if (date1[i] > date2[i]) return 0;
        }
        return 0;
    }
}