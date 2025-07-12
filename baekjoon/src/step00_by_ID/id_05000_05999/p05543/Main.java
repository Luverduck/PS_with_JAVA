package baekjoon.src.step00_by_ID.id_05000_05999.p05543;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int res1 = 2001;
        for (int i = 0; i < 3; ++i) {
            int hamburger = Integer.parseInt(br.readLine());
            res1 = Math.min(res1, hamburger);
        }
        int res2 = 2001;
        for (int i = 0; i < 2; ++i) {
            int drink = Integer.parseInt(br.readLine());
            res2 = Math.min(res2, drink);
        }
        bw.append(String.valueOf(res1 + res2 - 50));

        bw.flush();
        br.close();
        bw.close();
    }
}