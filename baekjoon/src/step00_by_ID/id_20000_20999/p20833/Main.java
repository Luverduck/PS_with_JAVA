package step00_by_ID.id_20000_20999.p20833;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int res = N * (N + 1) / 2;
        res *= res;
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}