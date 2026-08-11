package baekjoon.step00_by_ID.id_13000_13999.p13136;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        long res = (long) (Math.ceil(1.0 * R / N) * Math.ceil(1.0 * C / N));
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}