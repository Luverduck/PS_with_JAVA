package step00_by_ID.id_32000_32999.p32498;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int res = 0;
        for(int n = 0; n < N; ++n) {
            int D = Integer.parseInt(br.readLine());
            if(D % 2 != 0) res++;
        }
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}