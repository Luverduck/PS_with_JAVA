package step00_by_ID.id_10000_10999.p10480;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (N-- > 0) {
            int X = Integer.parseInt(br.readLine());
            sb.append(String.format("%d is ", X)).append(X % 2 == 0 ? "even" : "odd").append('\n');
        }
        bw.append(sb);

        bw.flush();
        br.close();
        bw.close();
    }
}