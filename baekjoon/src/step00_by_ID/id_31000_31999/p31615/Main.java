package baekjoon.src.step00_by_ID.id_31000_31999.p31615;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append(A + B);
        bw.append(String.valueOf(sb.length()));

        bw.flush();
        br.close();
        bw.close();
    }
}