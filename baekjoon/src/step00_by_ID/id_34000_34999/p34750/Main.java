package step00_by_ID.id_34000_34999.p34750;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int ratio = 5;
        if (N >= 1000000) ratio = 20;
        else if (N >= 500000) ratio = 15;
        else if (N >= 100000) ratio = 10;
        bw.append(String.valueOf(N * ratio / 100)).append(" ").append(String.valueOf(N * (100 - ratio) / 100));

        bw.flush();
        br.close();
        bw.close();
    }
}