package baekjoon.step00_by_ID.id_15000_15999.p15727;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.parseInt(br.readLine());
        int res = L / 5;
        if (L % 5 != 0) res++;
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}