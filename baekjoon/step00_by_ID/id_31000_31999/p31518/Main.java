package baekjoon.step00_by_ID.id_31000_31999.p31518;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 3; ++i) {
            st = new StringTokenizer(br.readLine());
            while (N-- > 0) {
                if (st.nextToken().equals("7")) {
                    sb.append("7");
                    break;
                }
            }
        }
        bw.append(sb.toString().equals("777") ? "777" : "0");

        bw.flush();
        br.close();
        bw.close();
    }
}