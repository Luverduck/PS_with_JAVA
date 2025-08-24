package baekjoon.src.step00_by_ID.id_02000_02999.p02441;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String star = "*", blink = " ";
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int n = 0; n < N; ++n) {
            sb.append(blink.repeat(n));
            sb.append(star.repeat(N - n));
            sb.append('\n');
        }
        bw.append(sb);

        bw.flush();
        br.close();
        bw.close();
    }
}