package baekjoon.src.step00_by_ID.id_24000_24999.p24723;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        bw.append(String.valueOf((int)Math.pow(2, N)));

        bw.flush();
        br.close();
        bw.close();
    }
}