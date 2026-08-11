package baekjoon.step00_by_ID.id_34000_34999.p34813;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        switch (s.charAt(0)) {
            case 'F': bw.append("Foundation"); break;
            case 'C': bw.append("Claves"); break;
            case 'V': bw.append("Veritas"); break;
            case 'E': bw.append("Exploration"); break;
        }

        bw.flush();
        br.close();
        bw.close();
    }
}