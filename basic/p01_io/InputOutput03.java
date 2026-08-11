package basic.p01_io;

import java.io.*;

public class InputOutput03 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 한 줄 입력 저장
        String input = br.readLine();
        // 공백을 구분자로 문자열 자르기
        String[] inputSplit = input.split(" ");
        // 출력 버퍼에 저장
        for (String s : inputSplit)
            bw.append(s).append('\n');
        // 출력 버퍼 비우기
        bw.flush();

        br.close();
        bw.close();
    }
}