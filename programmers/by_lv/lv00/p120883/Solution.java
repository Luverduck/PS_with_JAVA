package programmers.by_lv.lv00.p120883;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 로그인 성공?
 * https://school.programmers.co.kr/learn/courses/30/lessons/120883
 */

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];
        String pw = id_pw[1];
        for (String[] data : db) {
            String db_id = data[0];
            String db_pw = data[1];
            if (db_id.equals(id))
                return db_pw.equals(pw) ? "login" : "wrong pw";
        }
        return "fail";
    }
}