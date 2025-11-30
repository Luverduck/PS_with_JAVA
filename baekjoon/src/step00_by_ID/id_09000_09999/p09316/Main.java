package step00_by_ID.id_09000_09999.p09316;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int n = 1; n <= N; ++n)
            bw.append("Hello World, Judge ").append(String.valueOf(n)).append("!\n");

        bw.flush();
        br.close();
        bw.close();
    }
}