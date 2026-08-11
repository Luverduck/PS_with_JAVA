package baekjoon.step00_by_ID.id_18000_18999.p18691;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int G = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            int ans = Math.max((E - C), 0);
            switch(G) {
                case 2: ans *= 3; break;
                case 3: ans *= 5; break;
            }
            bw.append(String.valueOf(ans)).append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}