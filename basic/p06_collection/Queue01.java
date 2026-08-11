package basic.p06_collection;

import java.util.*;

public class Queue01 {
    public static void main(String[] args) {

        // Queue 생성 및 초기화
        Queue<String> queue = new ArrayDeque<>(Arrays.asList("A", "B", "C"));

        // 맨 뒤에 요소 추가
        boolean queueOffer = queue.offer("D");

        // 맨 앞의 요소 제거 후 반환
        String queuePoll = queue.poll();

        // 맨 앞의 요소 반환
        String queuePeek = queue.peek();

        // 특정 요소의 포함 여부 반환
        boolean queueContains = queue.contains("B");

        // 비어있는지 여부 반환
        boolean queueIsEmpty = queue.isEmpty();

        // 요소의 수 반환
        int queueSize = queue.size();

    }
}
