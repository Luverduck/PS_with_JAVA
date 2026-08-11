package programmers.by_lv.lv00.p250130;

import java.util.Scanner;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * [PCCE 기출문제] 4번 / 저축
 * https://school.programmers.co.kr/learn/courses/30/lessons/250130
 */

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int before = sc.nextInt();
        int after = sc.nextInt();

        int money = start;
        int month = 1;
        while (money < 70) {
            money += before;
            month++;
        }
        while (money < 100) {
            money += after;
            month++;
        }

        System.out.println(month);
    }
}