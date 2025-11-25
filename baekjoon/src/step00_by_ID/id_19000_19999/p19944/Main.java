package baekjoon.src.step00_by_ID.id_19000_19999.p19944;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (M <= 2) bw.append("NEWBIE!");
        else if (M <= N) bw.append("OLDBIE!");
        else bw.append("TLE!");

        bw.flush();
        br.close();
        bw.close();
    }
}