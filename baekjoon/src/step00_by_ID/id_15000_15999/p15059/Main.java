package step00_by_ID.id_15000_15999.p15059;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int res = 0;
        StringTokenizer sta = new StringTokenizer(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; ++i) {
            int temp = Integer.parseInt(sta.nextToken()) - Integer.parseInt(str.nextToken());
            if (temp < 0) res += Math.abs(temp);
        }
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}