package programmers.by_lv.lv00.p181837;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 커피 심부름
 * https://school.programmers.co.kr/learn/courses/30/lessons/181837
 */

class Solution {
    public int solution(String[] order) {
        int[] cnt = new int[2];
        for (String s : order) {
            if (s.contains("americano") || s.equals("anything")) cnt[0]++;
            else if (s.contains("cafelatte")) cnt[1]++;
        }
        return 4500 * cnt[0] + 5000 * cnt[1];
    }
}