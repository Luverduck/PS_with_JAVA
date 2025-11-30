package step00_by_ID.id_34000_34999.p34281;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int w = Integer.parseInt(br.readLine());
        int l = Integer.parseInt(br.readLine());
        bw.append(String.valueOf(w * l));

        bw.flush();
        br.close();
        bw.close();
    }
}