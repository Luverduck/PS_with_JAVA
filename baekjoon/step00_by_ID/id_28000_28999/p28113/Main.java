package baekjoon.step00_by_ID.id_28000_28999.p28113;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int bus = A;
        int subway = N + (B - N);
        bw.append(bus == subway ? "Anything" : (bus < subway ? "Bus" : "Subway"));

        bw.flush();
        br.close();
        bw.close();
    }
}