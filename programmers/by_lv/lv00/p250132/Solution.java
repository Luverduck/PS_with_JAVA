package programmers.by_lv.lv00.p250132;

import java.util.Scanner;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * [PCCE 기출문제] 2번 / 피타고라스의 정리
 * https://school.programmers.co.kr/learn/courses/30/lessons/250132
 */

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = c * c - a * a;

        System.out.println(b_square);
    }
}