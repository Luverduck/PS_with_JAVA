package programmers.by_lv.lv00.p181916;

import java.util.Arrays;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 주사위 게임 3
 * https://school.programmers.co.kr/learn/courses/30/lessons/181916
 */

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] dice = new int[] {a, b, c, d};
        Arrays.sort(dice);
        // 모두 같을 경우
        if (dice[0] == dice[3]) {
            answer = 1111 * dice[3];
        }
        // 세 개가 같을 경우
        else if (dice[0] == dice[2] || dice[1] == dice[3]) {
            // dice[0] ~ dice[2] 가 같을 경우 || dice[1] ~ dice[3]이 같을 경우
            // >> dice[1]은 무조건 p
            // >> dice[0] 또는 dice[3] 중 하나는 q이므로 q = dice[0] + dice[3] - dice[1]
            answer = (int) Math.pow((10 * dice[1] + (dice[0] + dice[3] - dice[1])), 2);
        }
        // 두 개가 같을 경우
        else if (dice[0] == dice[1] && dice[2] == dice[3]) {
            answer = (dice[0] + dice[2]) * (dice[2] - dice[0]);
        }
        // 두 개만 같을 경우
        else if (dice[0] == dice[1]) {
            answer = dice[2] * dice[3];
        }
        else if (dice[1] == dice[2]) {
            answer = dice[0] * dice[3];
        }
        else if (dice[2] == dice[3]) {
            answer = dice[0] * dice[1];
        }
        else {
            answer = dice[0];
        }
        return answer;
    }
}