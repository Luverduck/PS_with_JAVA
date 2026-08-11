package baekjoon.step00_by_ID.id_16000_16999.p16693;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A1 = Integer.parseInt(st.nextToken());
        int P1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int R1 = Integer.parseInt(st.nextToken());
        int P2 = Integer.parseInt(st.nextToken());

        bw.append(1.0 * P1 / A1 > P2 / (Math.PI * R1 * R1) ? "Whole pizza" : "Slice of pizza");

        bw.flush();
        br.close();
        bw.close();
    }
}