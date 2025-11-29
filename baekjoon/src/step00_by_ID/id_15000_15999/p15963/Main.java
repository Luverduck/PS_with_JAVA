package step00_by_ID.id_15000_15999.p15963;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        String M = st.nextToken();
        bw.append(N.equals(M) ? "1" : "0");

        bw.flush();
        br.close();
        bw.close();
    }
}