package baekjoon.src.step00_by_ID.id_02000_02999.p02445;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int n = 1; n <= N; ++n) {
            bw.append("*".repeat(n));
            bw.append(" ".repeat(2 * (N - n)));
            bw.append("*".repeat(n));
            bw.append('\n');
        }
        for(int n = 2; n <= N; ++n) {
            bw.append("*".repeat(N - n + 1));
            bw.append(" ".repeat(2 * (n - 1)));
            bw.append("*".repeat(N - n + 1));
            bw.append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}