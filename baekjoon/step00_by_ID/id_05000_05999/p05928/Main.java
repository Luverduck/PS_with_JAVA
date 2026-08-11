package baekjoon.step00_by_ID.id_05000_05999.p05928;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int D = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int start = 11 * 60 + 11;
        int end = ((D - 11) * 24 + H) * 60 + M;
        bw.append(String.valueOf(Math.max(end - start, -1)));

        bw.flush();
        br.close();
        bw.close();
    }
}