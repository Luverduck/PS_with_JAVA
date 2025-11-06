package baekjoon.src.step00_by_ID.id_34000_34999.p34665;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String A = br.readLine();
        String B = br.readLine();
        bw.append(A.equals(B) ? "0" : "1550");

        bw.flush();
        br.close();
        bw.close();
    }
}