package programmers.by_lv.lv00.p120823;

import java.util.Scanner;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 직각삼각형 출력하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120823
 */

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; ++i) {
            sb.repeat("*", i);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}