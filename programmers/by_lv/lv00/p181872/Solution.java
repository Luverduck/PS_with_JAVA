package programmers.by_lv.lv00.p181872;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181872
 */

class Solution {
    static public String solution(String myString, String pat) {
        // String.lastIndexOf(String str) : 문자열에서 가장 마지막으로 등장한 str의 시작 인덱스 반환
        // String.substring(int beginIndex, int endIndex) : 문자열에서 beginIndex부터 endIndex 바로 전 부분 문자열 추출
        return myString.substring(0, myString.lastIndexOf(pat) + pat.length());
    }

    /*static void main() {
        System.out.println(solution("AbCdEFG", "dE"));
        System.out.println(solution("AAAAaaaa", "a"));
    }*/
}