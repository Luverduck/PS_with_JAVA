package baekjoon.src.step00_by_ID.id_29000_29999.p29163;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int res = 0;
        for (int n = 0; n < N; ++n)
            res += Integer.parseInt(st.nextToken()) % 2 == 0 ? 1 : -1;
        bw.append(res > 0 ? "Happy" : "Sad");

        bw.flush();
        br.close();
        bw.close();
    }
}