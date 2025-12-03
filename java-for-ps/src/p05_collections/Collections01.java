package p05_collections;

import java.util.*;

public class Collections01 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(6, 3, 2, 4, 5, 1));

        // List 오름차순 정렬
        List<Integer> listSortAsc = new ArrayList<>(list);
        Collections.sort(listSortAsc);
        // 또는
        listSortAsc.sort(null);

        // List 내림차순 정렬
        List<Integer> listSortDesc = new ArrayList<>(list);
        Collections.sort(listSortDesc, Collections.reverseOrder());
        // 또는
        listSortDesc.sort(Collections.reverseOrder());

        // List 범위 정렬
        List<Integer> listSortRange = new ArrayList<>(list.subList(0, 4));
        Collections.sort(listSortRange);

        // 이진 탐색을 통해 List의 특정 요소를 찾아 인덱스 반환
        List<Integer> listBinarySearch = new ArrayList<>(list);
        int findIdx = Collections.binarySearch(listBinarySearch, 4);

        // List 복사
        List<Integer> listCopy = new ArrayList<>(List.of(0, 0, 0, 0, 0, 0, 0));
        Collections.copy(listCopy, list);
        List<Integer> listNew = new ArrayList<>(list);

        // List 부분 복사
        List<Integer> listCopyRange = new ArrayList<>(list.subList(0, 3));

        // List의 모든 요소를 특정 값으로 초기화
        List<Integer> listFill = new ArrayList<>(list);
        Collections.fill(listFill, -1);

        // List의 모든 요소 중 특정 값을 다른 값으로 치환
        List<Integer> listReplaceAll = new ArrayList<>(List.of(1, 1, 1, 1, 4, 5, 6));
        Collections.replaceAll(listReplaceAll, 1, 100);

        // List의 두 요소의 위치 교환
        List<Integer> listSwap = new ArrayList<>(List.of(6, 3, 2, 4, 5, 1));
        Collections.swap(listSwap, 0, 5);

        // List의 동등 여부 반환
        List<Integer> listEquals1 = new ArrayList<>(list);
        List<Integer> listEquals2 = new ArrayList<>(list);
        boolean isEqual = listEquals1.equals(listEquals2);

        // List의 요소를 문자열로 변환
        List<Integer> listToString = new ArrayList<>(list);
        String listString = listToString.toString();

        // List를 배열로 변환
        List<Integer> listToArray = new ArrayList<>(list);
        Integer[] listArrayWrapper = listToArray.toArray(new Integer[0]);
        int[] listArrayPrimitive = listToArray.stream().mapToInt(i -> i).toArray();

        // List의 중복 요소 제거
        List<Integer> listDuplicated = new ArrayList<>(List.of(1, 1, 1, 1, 4, 5, 6));
        List<Integer> listDistinct = listDuplicated.stream().distinct().toList();

    }
}
