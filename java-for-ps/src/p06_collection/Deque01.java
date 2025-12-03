package p06_collection;

import java.util.*;

public class Deque01 {
    public static void main(String[] args) {
        
        // Deque 생성 및 초기화
        Deque<String> deque = new ArrayDeque<>(Arrays.asList("B", "C", "D"));

        // 맨 앞에 요소 추가
        boolean dequeOfferFirst = deque.offerFirst("A");
        
        // 맨 뒤에 요소 추가
        boolean dequeOfferLast = deque.offerLast("E");
        
        // 맨 앞의 요소 제거 후 반환
        String dequePollFirst = deque.pollFirst();

        // 맨 뒤의 요소 제거 후 반환
        String dequePollLast = deque.pollLast();

        // 맨 앞의 요소 반환
        String dequePeakFirst = deque.peekFirst();

        // 맨 뒤의 요소 반환
        String dequePeakLast = deque.peekLast();

        // 특정 요소의 포함 여부 반환
        boolean dequeContains = deque.contains("B");

        // 비어있는지 여부 반환
        boolean dequeIsEmpty = deque.isEmpty();

        // 요소의 수 반환
        int dequeSize = deque.size();

    }
}
