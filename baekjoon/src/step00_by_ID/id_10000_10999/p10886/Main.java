package step00_by_ID.id_10000_10999.p10886;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int res = 0;
        while (N-- > 0) {
            int temp = Integer.parseInt(br.readLine());
            res += temp > 0 ? 1 : -1;
        }
        bw.append(res > 0 ? "Junhee is cute!" : "Junhee is not cute!");

        bw.flush();
        br.close();
        bw.close();
    }
}