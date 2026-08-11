package basic.p06_collection;

import java.util.*;

public class PriorityQueue01 {
    public static void main(String[] args) {

        // PriorityQueue 생성 및 초기화
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Arrays.asList("A", "B", "C"));

        // 우선순위에 따라 요소 추가
        boolean priorityQueueOffer = priorityQueue.offer("D");

        // 우선순위가 가장 높은 요소 제거 후 반환
        String priorityQueuePoll = priorityQueue.poll();

        // 우선순위가 가장 높은 요소 반환
        String priorityQueuePeek = priorityQueue.peek();

        // 특정 요소의 포함 여부 반환
        boolean priorityQueueContains = priorityQueue.contains("B");

        // 비어있는지 여부 반환
        boolean priorityQueueEmptyEmpty = priorityQueue.isEmpty();

        // 요소의 수 반환
        int priorityQueueSize = priorityQueue.size();

    }
}
