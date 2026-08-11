package baekjoon.step00_by_ID.id_14000_14999.p14489;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long totalMoney = 0;
        while (st.hasMoreTokens())
            totalMoney += Long.parseLong(st.nextToken());
        long C = Long.parseLong(br.readLine());
        bw.append(String.valueOf(totalMoney >= 2 * C ? totalMoney - 2 * C : totalMoney));

        bw.flush();
        br.close();
        bw.close();
    }
}