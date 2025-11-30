package step00_by_ID.id_33000_33999.p33170;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int res = 0;
        for(int i = 0; i < 3; ++i)
            res += Integer.parseInt(br.readLine());
        bw.append(res <= 21 ? "1" : "0");

        bw.flush();
        br.close();
        bw.close();
    }
}