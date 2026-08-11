package programmers.by_lv.lv00.p250129;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * [PCCE 기출문제] 5번 / 산책
 * https://school.programmers.co.kr/learn/courses/30/lessons/250129
 */

class Solution {
    public int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int [2];
        for(int i=0; i<route.length(); i++){
            switch(route.charAt(i)){
                case 'N':
                    north++;
                    break;
                case 'S':
                    north--;
                    break;
                case 'E':
                    east++;
                    break;
                case 'W':
                    east--;
                    break;
            }
        }
        answer[0] = east;
        answer[1] = north;
        return answer;
    }
}