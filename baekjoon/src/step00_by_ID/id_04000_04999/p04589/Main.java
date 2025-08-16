package baekjoon.src.step00_by_ID.id_04000_04999.p04589;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder("Gnomes:\n");
        StringTokenizer st;
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            boolean asc = A <= B && B <= C;
            boolean desc = A >= B && B >= C;
            sb.append(asc || desc ? "Ordered" : "Unordered").append('\n');
        }
        bw.append(sb);

        bw.flush();
        br.close();
        bw.close();
    }
}