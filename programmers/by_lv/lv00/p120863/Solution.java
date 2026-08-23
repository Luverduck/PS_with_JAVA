package programmers.by_lv.lv00.p120863;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 다항식 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120863
 */

class Solution {
    static public String solution(String polynomial) {
        String[] terms = polynomial.split(" \\+ ");
        int coefficientX = 0;
        int coefficient1 = 0 ;

        for (String term : terms) {
            if (term.endsWith("x")) {
                String co = term.substring(0, term.length() - 1);
                coefficientX += co.isEmpty() ? 1 : Integer.parseInt(co);
            } else {
                coefficient1 += Integer.parseInt(term);
            }
        }

        if (coefficientX == 0) return String.valueOf(coefficient1);

        String xTerm = coefficientX == 1 ? "x" : coefficientX + "x";
        return coefficient1 == 0 ? xTerm : xTerm + " + " + coefficient1;
    }

    static void main() {
        String res = solution("3x + 7 + x");
        System.out.println("res = " + res);
    }
}