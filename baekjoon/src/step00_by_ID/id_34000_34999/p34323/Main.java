package step00_by_ID.id_34000_34999.p34323;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        long S = Long.parseLong(st.nextToken());

        long totalPrice = S * (M + 1);
        long res = Math.min(totalPrice * (100 - N) / 100, totalPrice - S);
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}