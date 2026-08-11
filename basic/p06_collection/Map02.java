package basic.p06_collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map02 {
    public static void main(String[] args) {

        // HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // LinkedHashMap >> HashMap + Doubly Linked List 기반
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // TreeMap >> Red-Black Tree 기반
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // 요소 추가
        String[] keys = { "C", "E", "D", "A", "B" };
        int[] values = { 3, 5, 4, 1, 2 };
        for (int i = 0; i < keys.length; ++i) {
            hashMap.put(keys[i], values[i]);
            linkedHashMap.put(keys[i], values[i]);
            treeMap.put(keys[i], values[i]);
        }

        // HashMap : 요소가 추가된 순서에 따라 요소를 저장하지 않는다.
        System.out.println("hashMap = " + hashMap);
        // linkedHashMap : 요소가 추가된 순서에 따라 요소를 저장한다.
        System.out.println("linkedHashMap = " + linkedHashMap);
        // treeMap : 요소가 추가된 순서와 상관없이 요소를 정렬하여 저장한다.
        System.out.println("treeMap = " + treeMap);

    }
}
