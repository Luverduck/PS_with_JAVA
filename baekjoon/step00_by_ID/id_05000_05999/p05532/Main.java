package baekjoon.step00_by_ID.id_05000_05999.p05532;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        long P = (long)Math.ceil(1.0 * A / C);
        long Q = (long)Math.ceil(1.0 * B / D);
        bw.append(String.valueOf(L - Math.max(P, Q)));

        bw.flush();
        br.close();
        bw.close();
    }
}