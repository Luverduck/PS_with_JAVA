package baekjoon.src.step00_by_ID.id_05000_05999.p05300;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int n = 1; n <= N; ++n) {
            sb.append(n).append(' ');
            if (n % 6 == 0 || n == N) sb.append("Go! ");
        }
        bw.append(sb);

        bw.flush();
        br.close();
        bw.close();
    }
}