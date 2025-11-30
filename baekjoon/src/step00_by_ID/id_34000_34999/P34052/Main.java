package step00_by_ID.id_34000_34999.P34052;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sec = 0;
        for (int i = 0; i < 4; ++i)
            sec += Integer.parseInt(br.readLine());
        bw.append(sec <= 1500 ? "Yes" : "No");

        bw.flush();
        br.close();
        bw.close();
    }
}