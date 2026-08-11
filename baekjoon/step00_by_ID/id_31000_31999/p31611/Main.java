package baekjoon.step00_by_ID.id_31000_31999.p31611;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());
        bw.append(X % 7 == 2 ? "1" : "0");

        bw.flush();
        br.close();
        bw.close();
    }
}