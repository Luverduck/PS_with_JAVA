package baekjoon.src.step00_by_ID.id_24000_24999.p24883;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        bw.append(s.equals("N") || s.equals("n") ? "Naver D2" : "Naver Whale");

        bw.flush();
        br.close();
        bw.close();
    }
}