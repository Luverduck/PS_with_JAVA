package baekjoon.step00_by_ID.id_34000_34999.p34691;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        String s;
        while (true) {
            s = br.readLine();
            if (s.equals("end")) break;
            switch(s) {
                case "animal": sb.append("Panthera tigris"); break;
                case "tree": sb.append("Pinus densiflora"); break;
                case "flower": sb.append("Forsythia koreana"); break;
            }
            sb.append('\n');
        }
        bw.append(sb);

        bw.flush();
        br.close();
        bw.close();
    }
}