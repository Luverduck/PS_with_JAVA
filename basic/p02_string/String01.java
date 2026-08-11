package basic.p02_string;

public class String01 {
    public static void main(String[] args) {

        String str1 = "ABCDEFGABC";

        // 문자열의 특정 인덱스의 문자
        char strCharAt = str1.charAt(3);
        System.out.println("strCharAt = " + strCharAt);

        // 문자열의 특정 문자의 인덱스 (앞 -> 뒤 방향으로 탐색했을 때 특정 문자가 가장 먼저 발견 된 인덱스)
        int strIndexOf = str1.indexOf('C');
        System.out.println("strIndexOf = " + strIndexOf);

        // 문자열의 특정 문자의 인덱스 (뒤 -> 앞 방향으로 탐색했을 때 특정 문자가 가장 먼저 발견 된 인덱스)
        int strLastIndexOf = str1.lastIndexOf('C');
        System.out.println("strLastIndexOf = " + strLastIndexOf);

        // 문자열에서 시작 인덱스부터 끝 인덱스 직전까지 추출
        String strSubstring1 = str1.substring(2, 5);
        System.out.println("strSubstring1 = " + strSubstring1);
        // 문자열에서 시작 인덱스부터 문자열 끝까지 추출
        String strSubstring2 = str1.substring(5);
        System.out.println("strSubstring2 = " + strSubstring2);

        // 문자열의 양 쪽 공백 문자 제거
        String str2 = "\nABC ";
        String strTrim = str2.trim();
        System.out.println("strTrim = " + strTrim);

        String str3 = "AaBbCcDd";
        // 문자열의 모든 문자를 대문자로 변경
        String strToUpperCase = str3.toUpperCase();
        System.out.println("strToUpperCase = " + strToUpperCase);
        // 문자열의 모든 문자를 소문자로 변경
        String strToLowerCase = str3.toLowerCase();
        System.out.println("strToLowerCase = " + strToLowerCase);

        String str4 = "ABC";
        String str5 = "AAC";
        // 문자열 간 사전순 비교
        int strCompareTo = str4.compareTo(str5);
        System.out.println("strCompareTo = " + strCompareTo);

        // 문자열 내 특정 문자열을 다른 문자열로 치환
        String str6 = "ABCDEFABC";
        String strReplace1 = str6.replace("A", "*");
        System.out.println("strReplace1 = " + strReplace1);
        String strReplace2 = str6.replace("ABC", "*");
        System.out.println("strReplace2 = " + strReplace2);

        // 문자열 내 특정 정규표현식을 만족하는 문자열을 다른 문자열로 치환
        String str7 = "AABBCCABC";
        String strReplaceAll = str7.replaceAll("A", "*");
        System.out.println("strReplaceAll = " + strReplaceAll);

    }
}
