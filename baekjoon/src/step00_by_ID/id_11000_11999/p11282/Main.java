package step00_by_ID.id_11000_11999.p11282;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()) - 1;
        bw.append(String.valueOf(Character.toChars('가' + N)));

        bw.flush();
        br.close();
        bw.close();
    }
}