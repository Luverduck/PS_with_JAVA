package baekjoon.src.step00_by_ID.id_07000_07999.p07595;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while (true) {
            input = br.readLine();
            if (input.equals("0")) break;
            int N = Integer.parseInt(input);
            for (int n = 1; n <= N; ++n)
                bw.append("*".repeat(n)).append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}