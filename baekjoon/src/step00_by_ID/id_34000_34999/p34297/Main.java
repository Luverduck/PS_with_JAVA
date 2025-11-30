package step00_by_ID.id_34000_34999.p34297;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        bw.append(String.valueOf(M * C));

        bw.flush();
        br.close();
        bw.close();
    }
}