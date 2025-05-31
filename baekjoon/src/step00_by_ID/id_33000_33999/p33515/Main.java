package baekjoon.src.step00_by_ID.id_33000_33999.p33515;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int T1 = Integer.parseInt(st.nextToken());
        int T2 = Integer.parseInt(st.nextToken());
        bw.append(String.valueOf(Math.min(T1, T2)));

        bw.flush();
        br.close();
        bw.close();
    }
}