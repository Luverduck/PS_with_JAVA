package step00_by_ID.id_11000_11999.p11721;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < input.length(); ++i) {
            sb.append(input.charAt(i));
            if((i + 1) % 10 == 0) sb.append('\n');
        }
        bw.append(sb);

        bw.flush();
        br.close();
        bw.close();
    }
}