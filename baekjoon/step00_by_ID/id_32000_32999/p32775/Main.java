package baekjoon.step00_by_ID.id_32000_32999.p32775;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int Sab = Integer.parseInt(br.readLine());
        int Fab = Integer.parseInt(br.readLine());
        bw.append(Sab <= Fab ? "high speed rail" : "flight");

        bw.flush();
        br.close();
        bw.close();
    }
}