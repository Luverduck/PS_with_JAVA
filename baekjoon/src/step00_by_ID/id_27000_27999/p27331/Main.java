package baekjoon.src.step00_by_ID.id_27000_27999.p27331;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int res = 0;
        for(int i = 0; i < 2; ++i) {
            res *= 10;
            res += Integer.parseInt(br.readLine());
        }
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}