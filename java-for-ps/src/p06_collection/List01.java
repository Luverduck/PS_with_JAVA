package p06_collection;

import java.util.*;

public class List01 {
    public static void main(String[] args) {

        // List 생성 및 초기화
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));

        // 요소 추가
        boolean listAdd = list.add("E");

        // 요소 추가
        list.add(3, "D");

        // 요소 반환
        String listGet = list.get(1);

        // 요소 제거
        list.remove("A");

        // 요소 제거 후 반환
        list.remove(0);

        // 특정 요소의 포함 여부 반환
        boolean listContains = list.contains("C");

        // 비어있는지 여부 반환
        boolean listIsEmpty = list.isEmpty();

        // 포함된 요소의 수 반환
        int listSize = list.size();

    }
}