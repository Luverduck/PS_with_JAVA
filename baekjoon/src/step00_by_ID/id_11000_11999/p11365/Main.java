package step00_by_ID.id_11000_11999.p11365;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        StringBuilder sb;
        while (true) {
            input = br.readLine();
            if (input.equals("END")) break;
            sb = new StringBuilder(input);
            bw.append(sb.reverse()).append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}