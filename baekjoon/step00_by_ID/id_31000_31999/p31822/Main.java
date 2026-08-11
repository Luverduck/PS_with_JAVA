package baekjoon.step00_by_ID.id_31000_31999.p31822;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String targetCode = br.readLine().substring(0, 5);
        int N = Integer.parseInt(br.readLine());
        int res = 0;
        while (N-- > 0) {
            String inputCode = br.readLine().substring(0, 5);
            if (targetCode.equals(inputCode)) res++;
        }
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}