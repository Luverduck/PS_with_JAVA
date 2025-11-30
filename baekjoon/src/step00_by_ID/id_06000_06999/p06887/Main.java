package step00_by_ID.id_06000_06999.p06887;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double N = Double.parseDouble(br.readLine());
        int res = (int)(Math.sqrt(N));
        bw.append("The largest square has side length ").append(String.valueOf(res)).append(".");

        bw.flush();
        br.close();
        bw.close();
    }
}