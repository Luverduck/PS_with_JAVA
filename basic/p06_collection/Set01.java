package basic.p06_collection;

import java.util.*;

public class Set01 {
    public static void main(String[] args) {

        // Set 생성 및 초기화
        Set<String> set = new HashSet<>(Arrays.asList("A", "B", "C"));

        // 요소 추가
        boolean setAdd = set.add("D");

        // 요소 제거
        boolean setRemove = set.remove("A");

        // 특정 요소 포함 여부 반환
        boolean setContains = set.contains("B");

        // 비어있는지 여부 반환
        boolean setIsEmpty = set.isEmpty();

        // 요소의 수 반환
        int setSize = set.size();

    }
}
