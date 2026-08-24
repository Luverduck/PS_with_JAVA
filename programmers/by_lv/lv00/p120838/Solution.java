package programmers.by_lv.lv00.p120838;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 모스부호 (1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/120838
 */

class Solution {
    String[] table = new String[]{
        ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
    };
    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        String[] morse = letter.split(" ");
        for (String s : morse) {
            for (int i = 0; i < table.length; ++i) {
                if (!s.equals(table[i])) continue;
                sb.append((char)(i + 'a'));
                break;
            }
        }
        return sb.toString();
    }
}