package baekjoon.src.step00_by_ID.id_33000_33999.p33165;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int V = Integer.parseInt(br.readLine());
        bw.append(String.valueOf(T * V));

        bw.flush();
        br.close();
        bw.close();
    }
}