package baekjoon.step00_by_ID.id_02000_02999.p02530;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken()) + Integer.parseInt(br.readLine());

        B += C / 60;
        C %= 60;

        A += B / 60;
        B %= 60;

        A %= 24;

        bw.append(String.valueOf(A)).append(' ').append(String.valueOf(B)).append(' ').append(String.valueOf(C));

        bw.flush();
        br.close();
        bw.close();
    }
}