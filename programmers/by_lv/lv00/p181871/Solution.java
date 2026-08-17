package programmers.by_lv.lv00.p181871;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 문자열이 몇 번 등장하는지 세기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181871
 */

class Solution {
    // 부분 문자열로 시작하는 위치 카운트
    public int solution(String myString, String pat) {
        int cnt = 0;
        for (int i = 0; i <= myString.length() - pat.length(); ++i) {
            if (myString.startsWith(pat, i)) cnt++;
        }
        return cnt;
    }
    // 부분 문자열 발견 인덱스 바로 다음 위치부터 indexOf() 실행 반복
    public int solution1(String myString, String pat) {
        int cnt = 0;
        int s = 0;
        while (true) {
            int idx = myString.indexOf(pat, s);
            if (idx == -1) break;
            cnt++;
            s = idx + 1;
        }
        return cnt;
    }
}