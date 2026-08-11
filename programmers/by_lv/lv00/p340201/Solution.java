package programmers.by_lv.lv00.p340201;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * [PCCE 기출문제] 7번 / 버스
 * https://school.programmers.co.kr/learn/courses/30/lessons/340201
 */

class Solution {
    public int solution(int seat, String[][] passengers) {
        int num_passenger = 0;
        for (int i = 0; i < passengers.length; i++) {
            num_passenger += func4(passengers[i]);
            num_passenger -= func3(passengers[i]);
        }
        int answer = func1(seat - num_passenger);
        return answer;
    }

    // 남아있는 좌석 수
    public int func1(int num) {
        if (0 > num) {
            return 0;
        } else {
            return num;
        }
    }

    // ?
    public int func2(int num) {
        if (num > 0) {
            return 0;
        } else {
            return num;
        }
    }

    // i번째 역 하차 승객 수
    static public int func3(String[] station) {
        int num = 0;
        for (int i = 0; i < station.length; i++) {
            if (station[i].equals("Off")) {
                num += 1;
            }
        }
        return num;
    }

    // i번째 역 승차 승객 수
    static public int func4(String[] station) {
        int num = 0;
        for (int i = 0; i < station.length; i++) {
            if (station[i].equals("On")) {
                num += 1;
            }
        }
        return num;
    }

    static void main() {

    }
}
