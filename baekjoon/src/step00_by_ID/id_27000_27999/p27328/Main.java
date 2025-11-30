package step00_by_ID.id_27000_27999.p27328;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        bw.append(A == B ? "0" : (A > B ? "1" : "-1"));

        bw.flush();
        br.close();
        bw.close();
    }
}