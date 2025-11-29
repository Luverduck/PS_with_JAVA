package step00_by_ID.id_10000_10999.p10797;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int res = 0;
        while (st.hasMoreTokens())
            if (st.nextToken().equals(N)) res++;
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}