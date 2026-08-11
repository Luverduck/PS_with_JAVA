package baekjoon.step00_by_ID.id_08000_08999.p08545;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder(br.readLine());
        bw.append(sb.reverse());

        bw.flush();
        br.close();
        bw.close();
    }
}