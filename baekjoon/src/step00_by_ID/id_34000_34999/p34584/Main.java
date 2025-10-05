package baekjoon.src.step00_by_ID.id_34000_34999.p34584;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        bw.append(2 * x > d ? "take it" : "double it");

        bw.flush();
        br.close();
        bw.close();
    }
}