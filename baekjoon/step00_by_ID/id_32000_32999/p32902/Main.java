package baekjoon.step00_by_ID.id_32000_32999.p32902;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        bw.append(String.valueOf(n + 1)).append(" ").append(String.valueOf(k * n + 1));

        bw.flush();
        br.close();
        bw.close();
    }
}