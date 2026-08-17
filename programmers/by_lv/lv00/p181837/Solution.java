package programmers.by_lv.lv00.p181837;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 커피 심부름
 * https://school.programmers.co.kr/learn/courses/30/lessons/181837
 */

class Solution {
    public int solution(String[] order) {
        int sum = 0;
        for (String s : order) {
            if (s.contains("cafelatte")) sum += 5000;
            else sum += 4500;
        }
        return sum;
    }
}