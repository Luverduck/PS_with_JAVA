package baekjoon.step00_by_ID.id_13000_13999.p13985;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[2]);
        int C = Integer.parseInt(input[4]);
        bw.append(A + B == C ? "YES" : "NO");

        bw.flush();
        br.close();
        bw.close();
    }
}