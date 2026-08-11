package basic.p06_collection;

import java.util.*;

public class Map01 {
    public static void main(String[] args) {

        // Map 생성 및 초기화
        Map<String, Integer> map = new HashMap<>(
            Map.of(
                "A", 1,
                "B", 2,
                "C", 3
            )
        );

        // 요소 추가
        map.put("D", 4);

        // 요소 추가 (해당 Key의 요소가 없을때만 추가)
        map.putIfAbsent("E", 5);

        // 요소 수정
        map.put("D", 3);

        // 요소 제거
        map.remove("E");

        // 특정 Key를 갖는 요소의 포함 여부 반환
        boolean mapContainsKey = map.containsKey("A");

        // 특정 Value를 갖는 요소의 포함 여부 반환
        boolean mapContainsValue = map.containsValue(5);

        // 비어있는지 여부 반환
        boolean mapIsEmpty = map.isEmpty();

        // 요소의 수 반환
        int mapSize = map.size();

        // 모든 Key를 Set 타입으로 반환
        Set<String> mapKeySet = map.keySet();

        // 모든 Value를 Collection 타입으로 반환
        Collection<Integer> mapValues = map.values();

        // 모든 Key-Value 쌍을 Set<Map.Entry<K, V>> 타입으로 반환
        Set<Map.Entry<String, Integer>> mapEntrySet = map.entrySet();
        for (var entry : mapEntrySet) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
