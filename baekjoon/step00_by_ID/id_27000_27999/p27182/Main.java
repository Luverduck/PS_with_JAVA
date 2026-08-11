package baekjoon.step00_by_ID.id_27000_27999.p27182;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int res = N - 7 > 0 ? N - 7 : M + 7;

        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}