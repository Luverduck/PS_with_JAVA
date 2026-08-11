package baekjoon.step00_by_ID.id_34000_34999.p34073;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int n = 0; n < N; ++n) {
            sb.append(st.nextToken()).append("DORO ");
        }
        bw.append(sb);

        bw.flush();
        br.close();
        bw.close();
    }
}