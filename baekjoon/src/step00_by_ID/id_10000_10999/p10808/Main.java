package step00_by_ID.id_10000_10999.p10808;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        int[] count = new int['z' - 'a' + 1];
        for (int i = 0; i < S.length(); ++i)
            count[S.charAt(i) - 'a']++;
        for (int i : count)
            bw.append(String.valueOf(i)).append(" ");

        bw.flush();
        br.close();
        bw.close();
    }
}