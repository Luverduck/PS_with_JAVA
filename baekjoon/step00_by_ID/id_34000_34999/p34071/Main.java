package baekjoon.step00_by_ID.id_34000_34999.p34071;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int numMin = Integer.MAX_VALUE, numMax = Integer.MIN_VALUE;
        int first = 0;
        for(int n = 0; n < N; ++n) {
            int temp = Integer.parseInt(br.readLine());
            if (first == 0) first = temp;
            numMin = Math.min(temp, numMin);
            numMax = Math.max(temp, numMax);
        }
        bw.append(first == numMin ? "ez" : (first == numMax ? "hard" : "?"));

        bw.flush();
        br.close();
        bw.close();
    }
}