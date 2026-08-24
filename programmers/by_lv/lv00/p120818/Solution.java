package programmers.by_lv.lv00.p120818;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * 옷가게 할인 받기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120818
 */

class Solution {
    public int solution(int price) {
        int discount = 0;
        if (price >= 500000) discount = 20;
        else if (price >= 300000) discount = 10;
        else if (price >= 100000) discount = 5;
        return price * (100 - discount) / 100;
    }
}