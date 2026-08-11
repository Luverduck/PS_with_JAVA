package baekjoon.step00_by_ID.id_34000_34999.p34543;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int W = Integer.parseInt(br.readLine());
        int res = 0;
        res += 10 * N;
        if (N >= 3) res += 20;
        if (N == 5) res += 50;
        if (W > 1000) res -= 15;
        bw.append(String.valueOf(Math.max(res, 0)));

        bw.flush();
        br.close();
        bw.close();
    }
}