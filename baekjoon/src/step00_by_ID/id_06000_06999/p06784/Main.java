package step00_by_ID.id_06000_06999.p06784;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int res = 0;
        String[] response = new String[N];
        for (int i = 0; i < N; ++i)
            response[i] = br.readLine();
        for (int i = 0; i < N; ++i) {
            String answer = br.readLine();
            if (!response[i].equals(answer)) continue;
            res++;
        }
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}