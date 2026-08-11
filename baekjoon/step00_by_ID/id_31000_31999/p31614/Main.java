package baekjoon.step00_by_ID.id_31000_31999.p31614;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int H = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        bw.append(String.valueOf(60 * H + M));

        bw.flush();
        br.close();
        bw.close();
    }
}