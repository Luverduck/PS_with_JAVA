package baekjoon.src.step00_by_ID.id_34000_34999.p34306;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int W = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        bw.append(String.valueOf(5280 * W / N));

        bw.flush();
        br.close();
        bw.close();
    }
}