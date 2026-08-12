package programmers.by_lv.lv00.p181945;

import java.util.Scanner;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 문자열 돌리기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181945
 */

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (int i = 0; i < a.length(); ++i)
            System.out.println(a.charAt(i));
    }
}