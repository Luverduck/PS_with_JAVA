package programmers.by_lv.lv00.p120885;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 이진수 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120885
 */

class Solution {
    /*static public String solution(String bin1, String bin2) {
        int dec1 = Integer.parseInt(bin1, 2);
        int dec2 = Integer.parseInt(bin2, 2);
        return Integer.toBinaryString(dec1 + dec2);
    }*/
    static public String solution(String bin1, String bin2) {
        StringBuilder sb = new StringBuilder();
        int b1Idx = bin1.length() - 1;
        int b2Idx = bin2.length() - 1;
        int carry = 0;
        while (b1Idx >= 0 || b2Idx >= 0 || carry > 0) {
            int sum = carry;
            if (b1Idx >= 0) sum += (bin1.charAt(b1Idx--) - '0');
            if (b2Idx >= 0) sum += (bin2.charAt(b2Idx--) - '0');
            sb.append(sum % 2);
            carry = (sum / 2);
        }
        return sb.reverse().toString();
    }
}