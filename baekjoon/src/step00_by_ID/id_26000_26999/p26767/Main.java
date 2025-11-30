package step00_by_ID.id_26000_26999.p26767;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int n = 1; n <= N; ++n) {
            if (n % 7 == 0 && n % 11 == 0) sb.append("Wiwat!");
            else if (n % 7 == 0) sb.append("Hurra!");
            else if (n % 11 == 0) sb.append("Super!");
            else sb.append(n);
            sb.append('\n');
        }
        bw.append(sb);

        bw.flush();
        br.close();
        bw.close();
    }
}