package baekjoon.step00_by_ID.id_13000_13999.p13752;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (N-- > 0) {
            int K = Integer.parseInt(br.readLine());
            sb.append("=".repeat(K)).append('\n');
        }
        bw.append(sb);

        bw.flush();
        br.close();
        bw.close();
    }
}