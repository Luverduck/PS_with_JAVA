package p01_io;

import java.io.*;

public class InputOutput04 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 한 줄 입력 저장
        String input = br.readLine();
        // 래퍼 타입으로 파싱
        int num = Integer.parseInt(input);
        // 출력 버퍼에 저장
        bw.append(String.valueOf(num));
        // 출력 버퍼 비우기
        bw.flush();

        br.close();
        bw.close();
    }
}
