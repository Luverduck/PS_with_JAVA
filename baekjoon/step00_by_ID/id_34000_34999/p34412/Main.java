package baekjoon.step00_by_ID.id_34000_34999.p34412;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        int res = x >= 13 ? ++x : x;
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}