package baekjoon.src.step00_by_ID.id_19000_19999.p19602;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int res = 0;
        for(int i = 1; i <= 3; ++i)
            res += i * Integer.parseInt(br.readLine());
        bw.append(res >= 10 ? "happy" : "sad");

        bw.flush();
        br.close();
        bw.close();
    }
}