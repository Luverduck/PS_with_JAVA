package baekjoon.src.step00_by_ID.id_05000_05999.p05596;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int[] scoreSum = new int[2];
        for (int i = 0; i < 2; ++i) {
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens())
                scoreSum[i] += Integer.parseInt(st.nextToken());
        }
        bw.append(String.valueOf(Math.max(scoreSum[0], scoreSum[1])));

        bw.flush();
        br.close();
        bw.close();
    }
}