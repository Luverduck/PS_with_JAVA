package baekjoon.step00_by_ID.id_32000_32999.p32342;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            String S = br.readLine();
            int res = 0;
            int cur = 0;
            while (cur < S.length()) {
                if (S.startsWith("WOW", cur)) {
                    res++;
                }
                cur++;
            }
            bw.append(String.valueOf(res)).append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}