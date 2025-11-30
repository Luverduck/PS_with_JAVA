package step00_by_ID.id_09000_09999.p09306;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int n = 1; n <= N; ++n) {
            sb.append("Case ").append(n).append(": ");
            String first = br.readLine();
            String second = br.readLine();
            sb.append(second).append(", ").append(first).append('\n');
        }
        bw.append(sb);

        bw.flush();
        br.close();
        bw.close();
    }
}