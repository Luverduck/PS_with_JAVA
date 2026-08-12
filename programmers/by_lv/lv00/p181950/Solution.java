package programmers.by_lv.lv00.p181950;

import java.util.Scanner;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 문자열 반복해서 출력하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181950
 */

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        System.out.println(str.repeat(n));
    }
}