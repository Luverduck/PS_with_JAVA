package baekjoon.src.step00_by_ID.id_30000_30999.p30793;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        double p = Double.parseDouble(st.nextToken());
        double r = Double.parseDouble(st.nextToken());
        double v = p / r;
        String res = "";
        if (v < 0.2) res = "weak";
        else if (v < 0.4) res = "normal";
        else if (v < 0.6) res = "strong";
        else res = "very strong";
        bw.append(res);

        bw.flush();
        br.close();
        bw.close();
    }
}