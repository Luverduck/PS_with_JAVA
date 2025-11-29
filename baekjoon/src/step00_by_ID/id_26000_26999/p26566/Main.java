package step00_by_ID.id_26000_26999.p26566;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int P1 = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            int P2 = Integer.parseInt(st.nextToken());
            double res1 = 1.0 * A / P1;
            double res2 = 1.0 * R * R * Math.PI / P2;
            bw.append(res1 > res2 ? "Slice of pizza" : "Whole pizza").append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}