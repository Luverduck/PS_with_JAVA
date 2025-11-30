package step00_by_ID.id_27000_27999.p27219;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append("V".repeat(N / 5));
        sb.append("I".repeat(N % 5));
        bw.append(sb);

        bw.flush();
        br.close();
        bw.close();
    }
}