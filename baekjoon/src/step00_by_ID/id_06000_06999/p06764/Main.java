package baekjoon.src.step00_by_ID.id_06000_06999.p06764;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        if (A == B && B == C && C == D)
            bw.append("Fish At Constant Depth");
        else if (A < B && B < C && C < D)
            bw.append("Fish Rising");
        else if (A > B && B > C && C > D)
            bw.append("Fish Diving");
        else
            bw.append("No Fish");

        bw.flush();
        br.close();
        bw.close();
    }
}