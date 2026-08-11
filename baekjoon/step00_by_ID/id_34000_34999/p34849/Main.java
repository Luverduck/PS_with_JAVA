package baekjoon.step00_by_ID.id_34000_34999.p34849;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        bw.append(N <= 10000 ? "Accepted" : "Time limit exceeded");

        bw.flush();
        br.close();
        bw.close();
    }
}