package baekjoon.src.step00_by_ID.id_18000_18999.p18409;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        int res = 0;
        for (int n = 0; n < N; ++n) {
            if (set.contains(S.charAt(n))) res++;
        }
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}