package programmers.by_lv.lv00.p340205;

import java.util.Scanner;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * [PCCE 기출문제] 3번 / 수 나누기
 * https://school.programmers.co.kr/learn/courses/30/lessons/340205
 */

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;

        while(number > 0) {
            answer += number % 100;
            number /= 100;
        }

        System.out.println(answer);
    }
}
