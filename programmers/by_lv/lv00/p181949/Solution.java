package programmers.by_lv.lv00.p181949;

import java.util.Scanner;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 대소문자 바꿔서 출력하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181949
 */

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); ++i) {
            char c = a.charAt(i);
            if (c < 'a') sb.append(Character.toLowerCase(c));
            else sb.append(Character.toUpperCase(c));
        }
        System.out.println(sb);
    }
}