package step00_by_ID.id_15000_15999.p15726;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());
        long case1 = A * B / C;
        long case2 = A * C / B;
        bw.append(String.valueOf(Math.max(case1, case2)));

        bw.flush();
        br.close();
        bw.close();
    }
}