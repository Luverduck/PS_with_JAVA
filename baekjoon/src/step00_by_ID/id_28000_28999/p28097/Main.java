package step00_by_ID.id_28000_28999.p28097;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int totalTime = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens())
            totalTime += Integer.parseInt(st.nextToken());
        totalTime += 8 * (N - 1);
        StringBuilder sb = new StringBuilder();
        sb.append(totalTime / 24).append(' ').append(totalTime % 24);
        bw.append(sb);

        bw.flush();
        br.close();
        bw.close();
    }
}