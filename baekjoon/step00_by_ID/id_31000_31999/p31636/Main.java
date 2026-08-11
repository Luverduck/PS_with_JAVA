package baekjoon.step00_by_ID.id_31000_31999.p31636;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        bw.append(S.contains("ooo") ? "Yes" : "No");

        bw.flush();
        br.close();
        bw.close();
    }
}