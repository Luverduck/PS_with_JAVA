package step00_by_ID.id_05000_05999.p05575;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        String input;
        while (true) {
            input = br.readLine();
            if (input == null) break;
            String[] record = input.split(" ");
            int h = Integer.parseInt(record[3]) - Integer.parseInt(record[0]);
            int m = Integer.parseInt(record[4]) - Integer.parseInt(record[1]);
            int s = Integer.parseInt(record[5]) - Integer.parseInt(record[2]);
            if (s < 0) {
                s += 60;
                m--;
            }
            if (m < 0) {
                m += 60;
                h--;
            }
            sb.append(h).append(' ').append(m).append(' ').append(s).append('\n');
        }
        bw.append(sb);

        bw.flush();
        br.close();
        bw.close();
    }
}