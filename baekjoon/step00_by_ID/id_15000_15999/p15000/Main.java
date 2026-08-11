package baekjoon.step00_by_ID.id_15000_15999.p15000;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        bw.append(input.toUpperCase());

        bw.flush();
        br.close();
        bw.close();
    }
}