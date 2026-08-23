package programmers.by_lv.lv00.p120853;

import java.util.StringTokenizer;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 컨트롤 제트
 * https://school.programmers.co.kr/learn/courses/30/lessons/120853
 */

class Solution {
    public int solution(String s) {
        StringTokenizer st = new StringTokenizer(s, " ");
        int res = 0;
        int prev = 0;
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (token.equals("Z")) res -= prev;
            else {
                prev = Integer.parseInt(token);
                res += prev;
            }
        }
        return res;
    }
}