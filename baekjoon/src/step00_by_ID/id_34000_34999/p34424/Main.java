package baekjoon.src.step00_by_ID.id_34000_34999.p34424;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());
        bw.append(String.valueOf((n - 1) * x));

        bw.flush();
        br.close();
        bw.close();
    }
}