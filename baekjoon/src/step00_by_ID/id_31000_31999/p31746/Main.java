package step00_by_ID.id_31000_31999.p31746;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder("SciComLove");
        int N = Integer.parseInt(br.readLine());
        if (N % 2 != 0) {
            sb.reverse();
        }
        bw.append(sb);

        bw.flush();
        br.close();
        bw.close();
    }
}