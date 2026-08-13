package programmers.by_lv.lv00.p181926;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 수 조작하기 1
 * https://school.programmers.co.kr/learn/courses/30/lessons/181926
 */

class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        for (int i = 0; i < control.length(); ++i) {
            char c = control.charAt(i);
            switch (c) {
                case 'w': n++; break;
                case 's': n--; break;
                case 'd': n += 10; break;
                case 'a': n -= 10; break;
            }
        }
        answer = n;
        return answer;
    }
}