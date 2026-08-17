package programmers.by_lv.lv00.p181870;

import java.util.ArrayList;
import java.util.List;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * ad 제거하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181870
 */

class Solution {
    static public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        for (String s : strArr) {
            if (!s.contains("ad")) list.add(s);
        }
        return list.toArray(String[]::new);
    }

    /*static void main() {
        String[] res = solution(new String[]{"there","are","no","a","ds"});
        for (String s : res) {
            System.out.print(s + " ");
        }
    }*/
}