package step00_by_ID.id_24000_24999.p24083;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        int res = (A + B - 1) % 12 + 1;
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}