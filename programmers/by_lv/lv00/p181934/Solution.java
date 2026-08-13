package programmers.by_lv.lv00.p181934;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 조건 문자열
 * https://school.programmers.co.kr/learn/courses/30/lessons/181934
 */

class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        boolean res = false;
        String op = ineq + eq;
        if (op.equals(">=")) res = n >= m;
        else if (op.equals("<=")) res = n <= m;
        else if (op.equals(">!")) res = n > m;
        else if (op.equals("<!")) res = n < m;
        return answer = (res ? 1 : 0);
    }
}