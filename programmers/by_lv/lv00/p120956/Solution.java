package programmers.by_lv.lv00.p120956;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 옹알이 (1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/120956
 */

class Solution {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        int res = 0;
        for (String s : babbling) {
            int idx = 0;
            while (idx < s.length()) {
                boolean matched = false;
                for (String word : words) {
                    if (s.startsWith(word, idx)) {
                        matched = true;
                        idx += word.length();
                        break;
                    }
                }
                if (!matched) break;
            }
            if (idx == s.length()) res++;
        }
        return res;
    }
}