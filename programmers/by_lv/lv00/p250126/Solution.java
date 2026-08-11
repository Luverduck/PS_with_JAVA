package programmers.by_lv.lv00.p250126;

/**
 * 코딩테스트 연습
 * 코딩 기초 트레이닝
 * [PCCE 기출문제] 8번 / 창고 정리
 * https://school.programmers.co.kr/learn/courses/30/lessons/250126
 */

class Solution {
    /**
     * @param storage : 정리되기 전 창고의 물건 이름이 담긴 문자열 리스트
     * @param num : 각 물건의 개수가 담긴 정수 리스트
     */
    public String solution(String[] storage, int[] num) {
        int num_item = 0;
        String[] clean_storage = new String[storage.length];
        int[] clean_num = new int[num.length];

        // 물건 순회
        for (int i = 0; i < storage.length; i++) {
            // 정리함 순회
            // 물건을 넣을 인덱스 계산 > 최초로 넣을 경우 -1
            int clean_idx = -1;
            for (int j = 0; j < num_item; j++) {
                if (storage[i].equals(clean_storage[j])) {
                    clean_idx = j;
                    break;
                }
            }
            // 최초로 정리함에 넣고 카운트
            if (clean_idx == -1) {
                clean_storage[num_item] = storage[i];
                clean_num[num_item] = num[i];
                num_item += 1;
            } else {
                clean_num[clean_idx] += num[i];
            }
        }

        // 아래 코드에는 틀린 부분이 없습니다.

        int num_max = -1;
        String answer = "";
        for (int i = 0; i < num_item; i++) {
            if (clean_num[i] > num_max) {
                num_max = clean_num[i];
                answer = clean_storage[i];
            }
        }
        return answer;
    }
}
