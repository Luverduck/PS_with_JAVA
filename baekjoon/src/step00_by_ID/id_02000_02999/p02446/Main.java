package step00_by_ID.id_02000_02999.p02446;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int n = 1; n <= N; ++n) {
            sb.append(" ".repeat(n - 1));
            sb.append("*".repeat(2 * (N - n + 1) - 1));
            sb.append('\n');
        }
        for(int n = 2; n <= N; ++n) {
            sb.append(" ".repeat(N - n));
            sb.append("*".repeat(2 * n - 1));
            sb.append('\n');
        }
        bw.append(sb);

        bw.flush();
        br.close();
        bw.close();
    }
}