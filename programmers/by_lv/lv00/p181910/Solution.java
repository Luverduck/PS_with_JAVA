package programmers.by_lv.lv00.p181910;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 문자열의 뒤의 n글자
 * https://school.programmers.co.kr/learn/courses/30/lessons/181910
 */

class Solution {
    static public String solution(String my_string, int n) {
        String answer = "";
        // substring(int beginIdx, int endIdx) : 문자열의 beginIdx 부터 endIdx '직전'까지 문자열 추출
        answer = my_string.substring(my_string.length() - n);
        return answer;
    }
    /*static void main() {
        solution("ProgrammerS123", 11);
    }*/
}