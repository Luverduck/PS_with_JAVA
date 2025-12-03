package p02_string;

public class StringBuilder01 {
    public static void main(String[] args) {

        String str = "ABCABC";

        // 문자열 끝에 문자열 추가
        StringBuilder sbAppend = new StringBuilder(str);
        sbAppend.append("*");
        System.out.println("sbAppend = " + sbAppend);

        // 문자열의 특정 인덱스에 문자열 삽입
        StringBuilder sbInsert = new StringBuilder(str);
        sbInsert.insert(1, "*");
        System.out.println("sbInsert = " + sbInsert);

        // 문자열의 시작 인덱스부터 끝 인덱스까지의 문자열 삭제
        StringBuilder sbDelete = new StringBuilder(str);
        sbDelete.delete(1, 3);
        System.out.println("sbDelete = " + sbDelete);

        // 문자열의 특정 인덱스의 문자 삭제
        StringBuilder sbDeleteCharAt = new StringBuilder(str);
        sbDeleteCharAt.deleteCharAt(1);
        System.out.println("sbDeleteCharAt = " + sbDeleteCharAt);

        // 문자열 내 특정 문자의 인덱스
        StringBuilder sbIndexOf = new StringBuilder(str);
        int sbIndex = sbIndexOf.indexOf("B");
        System.out.println("sbIndexOf sbIndex = " + sbIndex);

        // 문자열 내 특정 인덱스의 문자를 다른 문자로 치환
        StringBuilder sbSetCharAt = new StringBuilder(str);
        sbSetCharAt.setCharAt(1, '*');
        System.out.println("sbSetCharAt = " + sbSetCharAt);

        // 문자열 뒤집기
        StringBuilder sbReverse = new StringBuilder(str);
        sbReverse.reverse();
        System.out.println("sbReverse = " + sbReverse);

        // 문자열 길이 변경
        StringBuilder sbSetLength = new StringBuilder(str);
        sbSetLength.setLength(2);
        System.out.println("sbSetLength = " + sbSetLength);

    }
}