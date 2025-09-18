package baekjoon.src.step00_by_ID.id_14000_14999.p14038;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 0;
        for(int i = 0; i < 6; ++i)
            if(br.readLine().equals("W")) cnt++;

        String res;
        if(cnt >= 5) res = "1";
        else if(cnt >= 3) res = "2";
        else if(cnt >= 1) res = "3";
        else res = "-1";
        bw.append(res);

        bw.flush();
        br.close();
        bw.close();
    }
}