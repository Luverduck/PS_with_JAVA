package baekjoon.src.step00_by_ID.id_32000_32999.p32905;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        while (N-- > 0) {
            String tasks = br.readLine();
            int cnt = 0;
            for (int i = 0; i < M; i++)
                if (tasks.charAt(i << 1) == 'A') cnt++;
            if (cnt != 1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

        br.close();
    }
}