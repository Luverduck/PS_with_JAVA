package p06_collection;

import java.util.*;

public class PriorityQueue02 {
    public static void main(String[] args) {

        // 최소 힙 기반 우선순위 큐 생성 (값이 작을수록 우선순위가 높음)
        PriorityQueue<String> priorityQueueMinHeap = new PriorityQueue<>(Arrays.asList("B", "C", "D"));
        System.out.println("priorityQueueMinHeap = " + priorityQueueMinHeap);
        // 우선순위에 따라 요소 추가
        boolean priorityQueueMinHeapOffer = priorityQueueMinHeap.offer("A");
        System.out.println("priorityQueueMinHeap = " + priorityQueueMinHeap);
        // 우선순위가 가장 높은 요소 제거 후 반환
        String priorityQueueMinHeapPoll = priorityQueueMinHeap.poll();
        System.out.println("priorityQueueMinHeap = " + priorityQueueMinHeap);

        // 최대 힙 기반 우선순위 큐 생성 (값이 클수록 우선순위가 높음)
        PriorityQueue<String> priorityQueueMaxHeap = new PriorityQueue<>(Collections.reverseOrder());
        priorityQueueMaxHeap.addAll(Arrays.asList("B", "C", "D"));
        System.out.println("priorityQueueMaxHeap = " + priorityQueueMaxHeap);
        // 우선순위에 따라 요소 추가
        priorityQueueMaxHeap.offer("A");
        System.out.println("priorityQueueMinHeap = " + priorityQueueMaxHeap);
        // 우선순위가 가장 높은 요소 제거 후 반환
        priorityQueueMaxHeap.poll();
        System.out.println("priorityQueueMinHeap = " + priorityQueueMaxHeap);

    }
}
