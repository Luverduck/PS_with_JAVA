package step00_by_ID.id_32000_32999.p32025;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int H = Integer.parseInt(br.readLine());
        int W = Integer.parseInt(br.readLine());
        bw.append(String.valueOf(Math.min(H, W) * 50));

        bw.flush();
        br.close();
        bw.close();
    }
}