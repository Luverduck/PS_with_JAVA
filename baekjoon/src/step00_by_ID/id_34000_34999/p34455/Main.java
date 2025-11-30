package step00_by_ID.id_34000_34999.p34455;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int D = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());
        for(int e = 0; e < E; ++e) {
            String sign = br.readLine();
            int value = Integer.parseInt(br.readLine());
            D += (sign.equals("+") ? value : -value);
        }
        bw.append(String.valueOf(D));

        bw.flush();
        br.close();
        bw.close();
    }
}