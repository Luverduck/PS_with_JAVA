package baekjoon.src.step00_by_ID.id_33000_33999.p33810;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String origin = "SciComLove";
        String input = br.readLine();
        int res = 0;
        for(int i = 0; i < input.length(); ++i) {
            if(origin.charAt(i) - input.charAt(i) == 0) continue;
            res++;
        }
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}