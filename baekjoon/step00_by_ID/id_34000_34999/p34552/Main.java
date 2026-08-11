package baekjoon.step00_by_ID.id_34000_34999.p34552;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] M = br.readLine().split(" ");
        int N = Integer.parseInt(br.readLine());
        int res = 0;
        for (int n = 0; n < N; ++n) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int B = Integer.parseInt(st.nextToken());
            double L = Double.parseDouble(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            if (L < 2 || S < 17) continue;
            res += Integer.parseInt(M[B]);
        }
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}