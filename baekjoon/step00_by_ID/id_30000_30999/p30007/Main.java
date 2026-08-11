package baekjoon.step00_by_ID.id_30000_30999.p30007;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int A, B, X;
        for(int n = 0; n < N; ++n) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            X = Integer.parseInt(st.nextToken());
            bw.append(String.valueOf(A * (X - 1) + B)).append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}