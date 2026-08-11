package baekjoon.step00_by_ID.id_06000_06999.p06749;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        bw.append(String.valueOf(B + (B - A)));

        bw.flush();
        br.close();
        bw.close();
    }
}