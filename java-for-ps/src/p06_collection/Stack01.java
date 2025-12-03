package p06_collection;

import java.util.*;

public class Stack01 {
    public static void main(String[] args) {

        // Stack 생성 및 초기화
        Deque<String> stack = new ArrayDeque<>(Arrays.asList("B", "C", "D"));

        // 맨 앞에 요소 추가
        stack.push("A");

        // 맨 앞의 요소 제거 후 반환
        String stackPop = stack.pop();

        // 맨 앞의 요소 반환
        String stackPeek = stack.peek();

        // 특정 요소의 포함 여부 반환
        boolean stackContains = stack.contains("B");

        // 비어있는지 여부 반환
        boolean stackIsEmpty = stack.isEmpty();

        // 요소의 수 반환
        int stackSize = stack.size();

    }
}
