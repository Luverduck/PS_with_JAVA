package baekjoon.src.step00_by_ID.id_26000_26999.p26209;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        bw.append(!input.contains("9") ? "S" : "F");

        bw.flush();
        br.close();
        bw.close();
    }
}