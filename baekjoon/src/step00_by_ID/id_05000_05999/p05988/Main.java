package baekjoon.src.step00_by_ID.id_05000_05999.p05988;

import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int n = 0; n < N; ++n) {
            BigInteger K = new BigInteger(br.readLine());
            bw.append(K.mod(BigInteger.TWO).compareTo(BigInteger.ZERO) == 0 ? "even" : "odd").append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}