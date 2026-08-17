package programmers.by_lv.lv00.p181841;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 꼬리 문자열
 * https://school.programmers.co.kr/learn/courses/30/lessons/181841
 */

class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder sb = new StringBuilder();
        for (String str : str_list) {
            if (!str.contains(ex)) sb.append(str);
        }
        return sb.toString();
    }
}