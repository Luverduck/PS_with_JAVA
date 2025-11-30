package step00_by_ID.id_05000_05999.p05357;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (N-- > 0) {
            String s = br.readLine();
            char prev = '*';
            for (int i = 0; i < s.length(); ++i) {
                char c = s.charAt(i);
                if(c == prev) continue;
                sb.append(c);
                prev = c;
            }
            sb.append('\n');
        }
        bw.append(sb);

        bw.flush();
        br.close();
        bw.close();
    }
}