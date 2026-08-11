package basic.p06_collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set02 {
    public static void main(String[] args) {

        // HashSet
        HashSet<String> hashSet = new HashSet<>();

        // LinkedHashSet >> HashSet + Doubly Linked List 기반
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // TreeSet >> Red-Black Tree 기반
        TreeSet<String> treeSet = new TreeSet<>();

        // 요소 추가
        for (String component : new String[] { "C", "E", "D", "A", "B" }) {
            hashSet.add(component);
            linkedHashSet.add(component);
            treeSet.add(component);
        }

        // HashSet : 요소가 추가된 순서에 따라 요소를 저장하지 않는다.
        System.out.println("hashSet = " + hashSet);
        // LinkedHashSet : 요소가 추가된 순서에 따라 요소를 저장한다.
        System.out.println("linkedHashSet = " + linkedHashSet);
        // TreeSet : 요소가 추가된 순서와 상관없이 요소를 정렬하여 저장한다.
        System.out.println("treeSet = " + treeSet);

    }
}
