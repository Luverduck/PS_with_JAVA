package baekjoon.step00_by_ID.id_10000_10999.p10953;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), ",");
            int res = 0;
            while (st.hasMoreTokens())
                res += Integer.parseInt(st.nextToken());
            bw.append(String.valueOf(res)).append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}