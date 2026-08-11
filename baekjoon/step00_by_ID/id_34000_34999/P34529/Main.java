package baekjoon.step00_by_ID.id_34000_34999.P34529;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int Z = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int U = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        int res = 0;
        res += U * X / 100;
        res += V * Y / 50;
        res += W * Z / 20;
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}