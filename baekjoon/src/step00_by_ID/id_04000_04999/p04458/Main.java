package baekjoon.src.step00_by_ID.id_04000_04999.p04458;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (N-- > 0) {
            String input = br.readLine();
            sb.append(Character.toUpperCase(input.charAt(0))).append(input, 1, input.length()).append('\n');
        }
        bw.append(sb);

        bw.flush();
        br.close();
        bw.close();
    }
}