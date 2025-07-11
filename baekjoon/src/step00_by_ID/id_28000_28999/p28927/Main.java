package baekjoon.src.step00_by_ID.id_28000_28999.p28927;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] times = new int[2];
        StringTokenizer st;
        for(int i = 0; i < 2; ++i) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int f = Integer.parseInt(st.nextToken());
            times[i] += 3 * t + 20 * e + 120 * f;
        }
        bw.append(times[0] == times[1] ? "Draw" : (times[0] > times[1] ? "Max" : "Mel"));

        bw.flush();
        br.close();
        bw.close();
    }
}