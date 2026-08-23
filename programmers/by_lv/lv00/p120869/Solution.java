package programmers.by_lv.lv00.p120869;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 외계어 사전
 * https://school.programmers.co.kr/learn/courses/30/lessons/120869
 */

class Solution {
    /**
     * 1) spell의 모든 문자를 사용해야 함
     * 2) 각 문자를 정확히 한 번만 사용해야 함
     * 3) spell에 없는 문자가 추가되면 안 됨
     * @param spell : 알파벳이 담긴 배열
     * @param dic : 외계어 사전
     * @return 단어에 모든 알파벳이 존재할 경우 1, 그렇지 않으면 2
     */
    static public int solution(String[] spell, String[] dic) {
        int res = 2;
        for (String word : dic) {
            // spell의 모든 문자를 사용해야 하므로 word.length() == spell.length
            if (word.length() != spell.length) continue;
            boolean flag = true;
            for (String s : spell) {
                if (word.contains(s)) continue;
                flag = false;
                break;
            }
            if (flag) return 1;
        }
        return res;
    }

    static void main() {
        int res = solution(
            new String[]{"p", "o", "s"},
            new String[]{"sod", "eocd", "qixm", "adio", "soo"}
        );
        System.out.println("res = " + res);
    }
}