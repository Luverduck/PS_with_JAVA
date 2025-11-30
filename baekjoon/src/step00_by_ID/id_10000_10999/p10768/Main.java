package step00_by_ID.id_10000_10999.p10768;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        if (A == 2) {
            if (B == 18)
                bw.append("Special");
            else if (B < 18)
                bw.append("Before");
            else
                bw.append("After");
        } else if (A < 2)
            bw.append("Before");
        else
            bw.append("After");

        bw.flush();
        br.close();
        bw.close();
    }
}