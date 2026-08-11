package baekjoon.step00_by_ID.id_27000_27999.p27324;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();
        bw.append(N.charAt(0) == N.charAt(1) ? "1" : "0");

        bw.flush();
        br.close();
        bw.close();
    }
}