package programmers.by_lv.lv00.p181868;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 공백으로 구분하기 2
 * https://school.programmers.co.kr/learn/courses/30/lessons/181868
 */

class Solution {
    static public String[] solution(String my_string) {
        // String.trim() : 문자열 양 끝 공백 제거
        // String.split(String reg) : 정규표현식 기반 문자열 분리
        // - \s : 스페이스, 탭, 줄바꿈 등의 공백 문자
        // - \s+ : 공백 문자가 한 번 이상 연속됨
        return my_string.trim().split("\\s+");
    }

    /*static void main() {
        String[] res = solution(" i    love  you");
        for (String s : res) {
            System.out.print(s + " ");
        }
    }*/
}