package baekjoon.step00_by_ID.id_17000_17999.p17362;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] ans = { 1, 2, 3, 4, 5, 4, 3, 2 };
        int N = Integer.parseInt(br.readLine());
        bw.append(String.valueOf(ans[(N - 1) % 8]));

        bw.flush();
        br.close();
        bw.close();
    }
}