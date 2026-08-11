package baekjoon.step00_by_ID.id_14000_14999.p14761;

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
        int N = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        for (int n = 1; n <= N; ++n) {
            if (n % X != 0 && n % Y != 0)
                sb.append(n);
            else {
                if (n % X == 0) sb.append("Fizz");
                if (n % Y == 0) sb.append("Buzz");
            }
            sb.append('\n');
        }
        bw.append(sb);

        bw.flush();
        br.close();
        bw.close();
    }
}