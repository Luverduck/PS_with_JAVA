package step00_by_ID.id_17000_17999.p17863;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        bw.append(N / 10000 == 555 ? "YES" : "NO");

        bw.flush();
        br.close();
        bw.close();
    }
}