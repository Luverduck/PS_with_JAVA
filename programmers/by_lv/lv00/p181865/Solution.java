package programmers.by_lv.lv00.p181865;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 간단한 식 계산하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181865
 */

class Solution {
    public int solution(String binomial) {
        String[] arr = binomial.split(" ");
        int a = Integer.parseInt(arr[0]);
        String op = arr[1];
        int b = Integer.parseInt(arr[2]);
        int res = 0;
        switch(op) {
            case "+": res = a + b; break;
            case "-": res = a - b; break;
            case "*": res = a * b; break;
        }
        return res;
    }
}