package step00_by_ID.id_16000_16999.p16486;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int d1 = Integer.parseInt(br.readLine());
        int d2 = Integer.parseInt(br.readLine());
        bw.append(String.format("%.6f", (2 * (d1 + 3.141592 * d2))));

        bw.flush();
        br.close();
        bw.close();
    }
}