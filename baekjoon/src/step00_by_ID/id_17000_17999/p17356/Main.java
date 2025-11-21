package baekjoon.src.step00_by_ID.id_17000_17999.p17356;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        double M = 1.0 * (B - A) / 400;
        bw.append(String.valueOf(1.0 / (1 + Math.pow(10, M))));
//        bw.append(String.format("%.4f", 1.0 / (1 + Math.pow(10, M))));

        bw.flush();
        br.close();
        bw.close();
    }
}