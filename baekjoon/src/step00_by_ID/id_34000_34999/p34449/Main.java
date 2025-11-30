package step00_by_ID.id_34000_34999.p34449;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double d = Double.parseDouble(br.readLine());
        double w = Double.parseDouble(br.readLine());
        int n = Integer.parseInt(br.readLine());
        bw.append(3.14159 * d > n * w ? "YES" : "NO");

        bw.flush();
        br.close();
        bw.close();
    }
}