package programmers.by_lv.lv00.p181886;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 5명씩
 * https://school.programmers.co.kr/learn/courses/30/lessons/181886
 */

class Solution {
    static public String[] solution(String[] names) {
        String[] res = new String[(names.length + 4) / 5];
        int idx = 0;
        for (int i = 0; i < names.length; i += 5) {
            res[idx++] = names[i];
        }
        return res;
    }

    static void main() {
        String[] res = solution(
            new String[]{"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"}
        );
        for (String s : res) {
            System.out.print(s + " ");
        }
    }
}