package baekjoon.step00_by_ID.id_34000_34999.p34183;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int purchaseCount = N * 3 - M;
        if (purchaseCount <= 0)
            bw.append("0");
        else
            bw.append(String.valueOf(purchaseCount * A + B));

        bw.flush();
        br.close();
        bw.close();
    }
}