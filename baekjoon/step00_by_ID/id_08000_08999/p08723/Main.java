package baekjoon.step00_by_ID.id_08000_08999.p08723;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int maxLength = Math.max(a, Math.max(b, c));

        if (a * a + b * b + c * c == 2 * maxLength * maxLength)
            bw.append("1");
        else if (a == b && b == c)
            bw.append("2");
        else
            bw.append("0");

        bw.flush();
        br.close();
        bw.close();
    }
}