package baekjoon.src.step00_by_ID.id_22000_22999.p22279;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        double res = 0;
        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double q = Double.parseDouble(st.nextToken());
            double y = Double.parseDouble(st.nextToken());
            res += q * y;
        }
        bw.append(String.format("%.3f", res));

        bw.flush();
        br.close();
        bw.close();
    }
}