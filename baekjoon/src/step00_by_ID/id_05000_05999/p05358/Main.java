package step00_by_ID.id_05000_05999.p05358;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        String name;
        while (true) {
            name = br.readLine();
            if (name == null) break;
            for (int i = 0; i < name.length(); ++i) {
                char c = name.charAt(i);
                switch (c) {
                    case 'i': sb.append('e'); break;
                    case 'e': sb.append('i'); break;
                    case 'I': sb.append('E'); break;
                    case 'E': sb.append('I'); break;
                    default: sb.append(c);
                }
            }
            sb.append('\n');
        }
        bw.append(sb);

        bw.flush();
        br.close();
        bw.close();
    }
}