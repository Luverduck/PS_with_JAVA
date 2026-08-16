package programmers.by_lv.lv00.p181885;

import java.util.ArrayList;
import java.util.List;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 할 일 목록
 * https://school.programmers.co.kr/learn/courses/30/lessons/181885
 */

class Solution {
    static public String[] solution(String[] todo_list, boolean[] finished) {

        List<String> list = new ArrayList<>();
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) list.add(todo_list[i]);
        }
        return list.toArray(String[]::new);
    }

    /*static void main() {
        String[] res = solution(
            new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"},
            new boolean[]{true, false, true, false}
        );
        for (String s : res) {
            System.out.print(s + " ");
        }
    }*/
}