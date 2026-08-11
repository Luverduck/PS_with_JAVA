package baekjoon.step00_by_ID.id_34000_34999.p34824;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int y = 0, k = 0;
        for (int i = 1; i <= N; ++i) {
            if (y != 0 && k != 0) break;
            String name = br.readLine();
            if (name.equals("yonsei")) y = i;
            else if (name.equals("korea")) k = i;
        }
        bw.append(y < k ? "Yonsei Won!" : "Yonsei Lost...");

        bw.flush();
        br.close();
        bw.close();
    }
}