package programmers.by_lv.lv00.p181846;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 두 수의 합
 * https://school.programmers.co.kr/learn/courses/30/lessons/181846
 */

class Solution {
    public String solution(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        int maxLength = Math.max(a.length(), b.length());
        StringBuilder sb = new StringBuilder(maxLength + 1);
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            sb.append(sum % 10);
            carry = sum / 10;
        }
        return sb.reverse().toString();
    }
}