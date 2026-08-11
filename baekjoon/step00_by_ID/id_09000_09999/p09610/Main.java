package baekjoon.step00_by_ID.id_09000_09999.p09610;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] cnt = new int[6];
        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            if(X == 0 || Y == 0) cnt[5]++;
            else if(X > 0 && Y > 0) cnt[1]++;
            else if(X < 0 && Y < 0) cnt[3]++;
            else if(X > 0) cnt[4]++;
            else cnt[2]++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < cnt.length - 1; ++i)
            sb.append("Q").append(i).append(": ").append(cnt[i]).append('\n');
        sb.append("AXIS: ").append(cnt[cnt.length - 1]);
        bw.append(sb);

        bw.flush();
        br.close();
        bw.close();
    }
}