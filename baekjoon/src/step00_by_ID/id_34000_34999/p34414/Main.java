package step00_by_ID.id_34000_34999.p34414;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        boolean res = true;
        while(N-- > 0) {
            int H = Integer.parseInt(br.readLine());
            if (H < 48) res = false;
        }
        bw.append(res ? "True" : "False");

        bw.flush();
        br.close();
        bw.close();
    }
}